package org.harrygovert.model.ah;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AHLinks {
    @Data
    @ToString
    private static class AHLink {
        private String href;
    }

    private AHLink first;
    private AHLink current;
    private AHLink next;
    private AHLink last;
}
