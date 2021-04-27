package org.harrygovert.model.ah;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AHProductWeight {

    private AHProductDrainedWeight drainedWeight;

    @Data
    @ToString
    public static class AHProductDrainedWeight {

        private Double value;
        private AHDataElement measurementUnitCode;
        private Integer weightInGRM;
    }
}
