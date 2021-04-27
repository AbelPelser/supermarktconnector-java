package org.harrygovert.model.ah;

import java.util.List;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AHSearchFilter {

    @Data
    @ToString
    private static class AHSearchFilterOption {

        private String id;
        private String label;
        private Integer count;
        private Boolean display;
    }

    private String id;
    private String label;
    private List<AHSearchFilterOption> options;
    private String type;
    private Boolean booleanFilter;
}
