package org.harrygovert;

import java.util.List;
import java.util.Optional;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.SneakyThrows;
import lombok.ToString;
import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.RequestBuilder;
import org.harrygovert.model.ApiError;
import org.harrygovert.model.jumbo.JumboCategoryResult;
import org.harrygovert.model.jumbo.JumboCategoryResult.JumboCategories.JumboCategory;
import org.harrygovert.model.jumbo.JumboError;
import org.harrygovert.model.jumbo.JumboProduct;
import org.harrygovert.model.jumbo.JumboProducts;
import org.harrygovert.model.jumbo.JumboSearchResult;

public class JumboConnector extends AbstractConnector {

    private static final String JUMBO_BASE_API_URL = "https://mobileapi.jumbo.com/v9";
    private static final String JUMBO_SEARCH_API_URL = JUMBO_BASE_API_URL + "/search";
    private static final String JUMBO_CATEGORY_API_URL = JUMBO_BASE_API_URL + "/categories";

    private RequestBuilder createBaseJumboGetRequestBuilder(String url) {
        return RequestBuilder.get(url).setHeader(HttpHeaders.USER_AGENT, FAKE_USER_AGENT);
    }

    @Override
    protected Class<? extends ApiError> getErrorModelClass() {
        return JumboError.class;
    }

    @SneakyThrows
    public JumboProduct getProductByBarcode(String barcode) {
        RequestBuilder request = createBaseJumboGetRequestBuilder(JUMBO_SEARCH_API_URL)
            .addParameter("q", barcode);
        JumboSearchResult jumboBarcodeResponse = performJsonRequest(request, JumboSearchResult.class);
        return Optional.of(jumboBarcodeResponse.getProducts())
            .map(JumboProducts::getData)
            .filter(l -> !l.isEmpty())
            .map(l -> l.get(0))
            .orElse(null);
    }

    // Does not work
    public JumboProduct getProductDetails(String productId) {
        RequestBuilder request = createBaseJumboGetRequestBuilder(JUMBO_SEARCH_API_URL + "/" + productId);
        return performJsonRequest(request, JumboProduct.class);
    }

    public List<JumboCategory> getCategories() {
        return getSubCategories(null);
    }

    public List<JumboCategory> getSubCategories(String categoryId) {
        RequestBuilder request = createBaseJumboGetRequestBuilder(JUMBO_CATEGORY_API_URL);
        if (categoryId != null) {
            request.addParameter("id", categoryId);
        }
        return performJsonRequest(request, JumboCategoryResult.class).getCategories().getData();
    }

    public JumboSearchResult searchProducts(JumboSearchSpecification spec) {
        int size = spec.getSize();
        int page = spec.getPage();
        if ((page + 1) * size > 10000) {
            throw new IllegalArgumentException("Pagination limit on JumboConnector is 10.000");
        }
        RequestBuilder request = createBaseJumboGetRequestBuilder(JUMBO_SEARCH_API_URL)
            .addParameter("offset", page * size + "")
            .addParameter("limit", size + "")
            .addParameter("q", spec.getQuery());
        return performJsonRequest(request, JumboSearchResult.class);
    }

    public List<JumboProduct> searchAllProducts(JumboSearchSpecification spec) {
        spec.setPage(0);
        JumboSearchResult firstResult = searchProducts(spec);
        List<JumboProduct> allProducts = firstResult.getProducts().getData();

        int nPages = (firstResult.getProducts().getTotal() / spec.size) + 1;
        for (int page = 1; page < nPages; page++) {
            spec.setPage(page);
            allProducts.addAll(searchProducts(spec).getProducts().getData());
        }
        return allProducts;
    }

    @Builder
    @Data
    @ToString
    public static class JumboSearchSpecification {

        @NonNull
        private final String query;
        @Builder.Default
        private int page = 0;
        @Builder.Default
        private int size = 1000;
    }
}
