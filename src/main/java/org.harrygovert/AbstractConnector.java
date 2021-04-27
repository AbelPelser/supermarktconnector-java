package org.harrygovert;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.harrygovert.exception.ApiException;
import org.harrygovert.model.ApiError;


@Slf4j
public abstract class AbstractConnector {

    protected static final String FAKE_USER_AGENT = "Mozilla/5.0 (Macintosh; k; rv:81.0) Gecko/20100101 Firefox/81.0";
    private static final HttpClient HTTP_CLIENT = getHttpClient();
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    static {
        OBJECT_MAPPER.registerModule(new JavaTimeModule());
    }

    private static HttpClient getHttpClient() {
        RequestConfig config = RequestConfig.custom()
            .setCookieSpec(CookieSpecs.STANDARD)
            .build();
        return HttpClients.custom()
            .setDefaultRequestConfig(config)
            .build();
    }

    @SneakyThrows
    private <T> T deserializeModelIgnoringUnknownProperties(String responsePayload, Class<T> responseModelClass) {
        OBJECT_MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        T result = OBJECT_MAPPER.readValue(responsePayload, responseModelClass);
        OBJECT_MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
        return result;
    }

    @SneakyThrows
    private <T> T deserializeModelWarningUnknownProperties(String responsePayload, Class<T> responseModelClass) {
        try {
            return OBJECT_MAPPER.readValue(responsePayload, responseModelClass);
        } catch (UnrecognizedPropertyException e) {
            log.warn("Found unknown property: {}", e.toString());
            log.warn("Payload: {}", responsePayload);
            return deserializeModelIgnoringUnknownProperties(responsePayload, responseModelClass);
        }
    }

    @SneakyThrows
    public <T> T performJsonRequest(RequestBuilder requestBuilder, Class<T> responseModelClass) {
        HttpResponse response = HTTP_CLIENT.execute(requestBuilder.build());
        String responsePayload = EntityUtils.toString(response.getEntity());
        if (response.getStatusLine().getStatusCode() != 200) {
            ApiError error = deserializeModelWarningUnknownProperties(responsePayload, getErrorModelClass());
            throw new ApiException(error);
        }
        return deserializeModelWarningUnknownProperties(responsePayload, responseModelClass);
    }

    protected abstract Class<? extends ApiError> getErrorModelClass();
}
