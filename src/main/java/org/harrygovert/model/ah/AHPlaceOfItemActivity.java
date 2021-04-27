package org.harrygovert.model.ah;

import java.util.List;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AHPlaceOfItemActivity {

    private AHPlaceOfProductActivity placeOfProductActivity;

    @Data
    @ToString
    public static class AHPlaceOfProductActivity {

        private List<AHProductActivityDetails> productActivityDetails;
        private List<String> provenanceStatement;

        @Data
        @ToString
        public static class AHProductActivityDetails {

            private List<String> regionDescription;
            private AHDataElement typeCode;
        }
    }
}
