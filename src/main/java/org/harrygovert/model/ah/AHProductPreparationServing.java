package org.harrygovert.model.ah;

import java.util.List;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AHProductPreparationServing {

    private List<AHPreparationServing> preparationServing;
    private AHServingQuantityInformation servingQuantityInformation;

    @Data
    @ToString
    public static class AHServingQuantityInformation {
        private Integer maximumNumberOfSmallestUnitsPerPackage;
        private Integer numberOfSmallestUnitsPerPackage;
        private Double numberOfServingsPerPackage;
    }

    @Data
    @ToString
    public static class AHPreparationServing {

        private String instructions;
        private String servingSuggestion;
    }
}
