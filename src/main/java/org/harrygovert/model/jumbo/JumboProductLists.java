package org.harrygovert.model.jumbo;

import com.fasterxml.jackson.annotation.JsonAlias;
import java.util.List;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class JumboProductLists {

    private List<JumboProductList> data;

    @Data
    @ToString
    public static class JumboProductList {

        @JsonAlias("listID")
        private String listId;
        private String title;
        private int followers;
        private String author;
        private boolean verified;
        private String thumbnail;
    }
}
