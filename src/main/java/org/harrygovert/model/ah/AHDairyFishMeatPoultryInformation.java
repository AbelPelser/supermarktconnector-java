package org.harrygovert.model.ah;

import java.util.List;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AHDairyFishMeatPoultryInformation {

    private AHFishReportingInformation fishReportingInformation;

    @Data
    @ToString
    public static class AHFishReportingInformation {

        private AHCatchInformation catchInformation;

        @Data
        @ToString
        public static class AHCatchInformation {

            private List<AHDataElement> catchMethodCode;
        }
    }
}
