package org.harrygovert.model.ah;

import java.util.List;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AHProductMeasurements {

    private List<AHProductMeasurement> netContent;
    private String netContentStatement;
    private AHProductWeight weight;

    @Data
    @ToString
    public static class AHProductMeasurement {

        private String value;
        private AHDataElement measurementUnitCode;
    }
}
