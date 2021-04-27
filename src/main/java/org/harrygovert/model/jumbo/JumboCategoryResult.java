package org.harrygovert.model.jumbo;

import java.util.List;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class JumboCategoryResult {

    private JumboCategories categories;

    @Data
    @ToString
    public static class JumboCategories {

        private List<JumboCategory> data;

        @Data
        @ToString
        public static class JumboCategory {

            private String id;
            private String title;
            private int subCategoriesCount;
            private String imageUrl;
        }
    }
}
