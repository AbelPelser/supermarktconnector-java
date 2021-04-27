package org.harrygovert.model.ah;

import java.util.List;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AHSearchResult {

    @Data
    @ToString
    public static class AHPage {

        private Integer size;
        private Integer totalElements;
        private Integer totalPages;
        private Integer number;
    }

    private AHPage page;
    private List<AHProduct> products;
    private AHLinks links;
    private List<AHSearchFilter> filters;
    private List<String> sortOn;
    private AHSearchConfiguration configuration;
    // Unknown
    private List<String> ads;
}
