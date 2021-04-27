package org.harrygovert.model.jumbo;

import java.util.List;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class JumboFilters {

    private List<JumboFilter> data;

    @Data
    @ToString
    public static class JumboFilter {

        private String title;
        private String type;
        private List<JumboFilterItem> items;
        private int visibleAmount;

        @Data
        @ToString
        public static class JumboFilterItem {

            private String title;
            private String filters;
            private int count;
            private boolean isCategory;

            public boolean isIsCategory() {
                return isCategory;
            }

            public void setIsCategory(boolean category) {
                isCategory = category;
            }
        }
    }
}
