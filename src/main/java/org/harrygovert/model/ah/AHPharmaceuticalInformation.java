package org.harrygovert.model.ah;

import java.util.List;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AHPharmaceuticalInformation {

    private List<AHDosage> dosages;
    private List<String> drugSideEffectsAndWarnings;

    @Data
    @ToString
    public static class AHDosage {

        private List<String> formTypeCodeReference;
        private List<String> recommendation;
    }
}
