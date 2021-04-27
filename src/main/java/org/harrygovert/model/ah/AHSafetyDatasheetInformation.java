package org.harrygovert.model.ah;

import java.util.List;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AHSafetyDatasheetInformation {

    private AHGhsDetail ghsDetail;

    @Data
    @ToString
    public static class AHGhsDetail {

        private List<AHDataElement> ghsSymbolDescriptionCode;
        private List<AHSafetyStatement> hazardStatement;
        private List<AHSafetyStatement> precautionaryStatement;
        private AHDataElement ghsSignalWordsCode;

        @Data
        @ToString
        public static class AHSafetyStatement {
            private AHDataElement code;
            private List<String> description;
        }
    }
}
