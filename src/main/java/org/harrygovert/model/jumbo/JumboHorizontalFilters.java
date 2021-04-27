package org.harrygovert.model.jumbo;

import java.util.List;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class JumboHorizontalFilters {

    private List<JumboHorizontalFilter> data;

    @Data
    @ToString
    public static class JumboHorizontalFilter {

        private String title;
        private String filters;
    }
}
