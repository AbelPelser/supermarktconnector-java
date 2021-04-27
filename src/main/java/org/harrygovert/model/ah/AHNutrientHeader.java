package org.harrygovert.model.ah;

import java.util.List;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AHNutrientHeader {

    private List<String> dailyValueIntakeReference;
    private AHNutrientQuantity nutrientBasisQuantity;
    private List<String> nutrientBasisQuantityDescription;
    private List<AHNutrientDetail> nutrientDetail;
    private AHDataElement preparationStateCode;

    @Data
    @ToString
    public static class AHNutrientQuantity {

        private Double value;
        private AHDataElement measurementUnitCode;
    }

    @Data
    @ToString
    public static class AHNutrientDetail {

        private Double dailyValueIntakePercent;
        private AHDataElement dailyValueIntakePercentMeasurementPrecisionCode;
        private AHDataElement measurementPrecisionCode;
        private List<String> nutrientSource;
        private AHDataElement nutrientTypeCode;
        private List<AHNutrientQuantity> quantityContained;
    }
}
