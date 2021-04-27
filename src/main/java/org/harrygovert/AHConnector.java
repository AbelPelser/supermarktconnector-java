package org.harrygovert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.ToString;
import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.RequestBuilder;
import org.harrygovert.model.ApiError;
import org.harrygovert.model.ah.AHAnonymousTokenResponse;
import org.harrygovert.model.ah.AHCategory;
import org.harrygovert.model.ah.AHError;
import org.harrygovert.model.ah.AHProduct;
import org.harrygovert.model.ah.AHProductDetails;
import org.harrygovert.model.ah.AHSearchResult;
import org.harrygovert.model.ah.AHSubCategoryDetails;

public class AHConnector extends AbstractConnector {

    private static final String AH_BARCODE_API_URL = "https://ms.ah.nl/mobile-services/product/search/v1/gtin/";
    private static final String AH_SEARCH_API_URL = "https://ms.ah.nl/mobile-services/product/search/v2";
    private static final String AH_PRODUCT_API_URL = "https://ms.ah.nl/mobile-services/product/detail/v4/fir/";
    private static final String AH_CATEGORY_API_URL = "https://ms.ah.nl/mobile-services/v1/product-shelves/categories/";
    private static final String AH_ANON_TOKEN_API_URL = "https://ms.ah.nl/create-anonymous-member-token";
    private static final String AH_API_HOST = "ms.ah.nl";
    private final String AH_ACCESS_TOKEN = "Bearer " + getAnonymousAuthToken();

    @Override
    protected Class<? extends ApiError> getErrorModelClass() {
        return AHError.class;
    }

    private RequestBuilder createBaseAHGetRequestBuilder(String url) {
        return addBaseAHHeaders(RequestBuilder.get(url))
            .setHeader(HttpHeaders.AUTHORIZATION, AH_ACCESS_TOKEN);
    }

    private RequestBuilder addBaseAHHeaders(RequestBuilder builder) {
        return builder
            .setHeader(HttpHeaders.USER_AGENT, FAKE_USER_AGENT)
            .setHeader(HttpHeaders.HOST, AH_API_HOST);
    }

    private String getAnonymousAuthToken() {
        RequestBuilder request = addBaseAHHeaders(RequestBuilder.post(AH_ANON_TOKEN_API_URL))
            .addParameter("client", "appie-anonymous");
        return performJsonRequest(request, AHAnonymousTokenResponse.class).getAccessToken();
    }

    public AHProduct getProductByBarcode(String barcode) {
        RequestBuilder request = createBaseAHGetRequestBuilder(AH_BARCODE_API_URL + barcode);
        return performJsonRequest(request, AHProduct.class);
    }

    public List<AHCategory> getCategories() {
        RequestBuilder request = createBaseAHGetRequestBuilder(AH_CATEGORY_API_URL);
        return Arrays.asList(performJsonRequest(request, AHCategory[].class));
    }

    public AHSubCategoryDetails getSubCategories(String categoryId) {
        RequestBuilder request = createBaseAHGetRequestBuilder(AH_CATEGORY_API_URL + categoryId + "/sub-categories");
        return performJsonRequest(request, AHSubCategoryDetails.class);
    }

    public AHSearchResult searchProducts(AHSearchSpecification spec) {
        RequestBuilder request = createBaseAHGetRequestBuilder(AH_SEARCH_API_URL)
            .addParameter("sortOn", spec.getSort())
            .addParameter("page", String.valueOf(spec.getPage()))
            .addParameter("size", String.valueOf(spec.getSize()))
            .addParameter("query", spec.getQuery());
        return performJsonRequest(request, AHSearchResult.class);
    }

    public List<AHProduct> searchAllProducts(AHSearchSpecification spec) {
        spec.setPage(0);
        AHSearchResult firstResult = searchProducts(spec);
        List<AHProduct> allProducts = new ArrayList<>(firstResult.getProducts());
        for (int page = 1; page < firstResult.getPage().getTotalPages(); page++) {
            spec.setPage(page);
            allProducts.addAll(searchProducts(spec).getProducts());
        }
        return allProducts;
    }

    public AHProductDetails getProductDetails(String webshopId) {
        RequestBuilder request = createBaseAHGetRequestBuilder(AH_PRODUCT_API_URL + webshopId);
        return performJsonRequest(request, AHProductDetails.class);
    }

    @Builder
    @Data
    @ToString
    public static class AHSearchSpecification {

        @NonNull
        private final String query;
        @Builder.Default
        private int page = 0;
        @Builder.Default
        private int size = 750;
        @Builder.Default
        private String sort = "RELEVANCE";
    }
}
