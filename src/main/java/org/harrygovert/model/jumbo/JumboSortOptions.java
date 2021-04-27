package org.harrygovert.model.jumbo;

import java.util.List;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class JumboSortOptions {

    private List<JumboSortOption> data;

    @Data
    @ToString
    public static class JumboSortOption {

        private String title;
        private String sort;
    }
}
