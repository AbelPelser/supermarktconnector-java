package org.harrygovert.model.ah;

import java.util.List;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AHTradeItem {

    private String gln;
    private String gtin;
    private List<AHAdditionalTradeItemIdentification> additionalTradeItemIdentification;
    private AHAlcoholInformation alcoholInformation;
    private List<AHAllergenInformationWrapper> allergenInformation;
    private AHAnimalFeeding animalFeeding;
    private List<AHCertificationInformationWrapper> certificationInformation;
    private AHConsumerInstructions consumerInstructions;
    private AHDairyFishMeatPoultryInformation dairyFishMeatPoultryInformation;
    private String foodAndBeverageIngredientStatement;
    private AHProductPreparationServing foodAndBeveragePreparationServing;
    private AHHealthWellnessPackagingMarking healthWellnessPackagingMarking;
    private AHHealthRelatedInformation healthRelatedInformation;
    private AHHealthcareInformation healthcareInformation;
    private AHNutritionalInformationWrapper nutritionalInformation;
    private String nonfoodIngredientStatement;
    private AHPackagingMarking packagingMarking;
    private AHPharmaceuticalInformation pharmaceuticalInformation;
    private AHPlaceOfItemActivity placeOfItemActivity;
    private List<AHReferencedFileDetailInformation> referencedFileDetailInformation;
    private List<AHRegulatoryInformation> regulatoryInformation;
    private List<AHSafetyDatasheetInformation> safetyDataSheetInformation;
    private AHSalesInformation salesInformation;
    private List<AHContactInformation> contactInformation;
    private AHProductDescription description;
    private AHProductLifespan lifespan;
    private AHProductMeasurements measurements;

    @Data
    @ToString
    public static class AHAnimalFeeding {

        private String additiveStatement;
        private String analyticalConstituentsStatement;
        private String compositionStatement;
        private List<AHDataElement> type;
        private String instructions;
        private List<AHDataElement> targetedConsumptionBy;
    }

    @Data
    @ToString
    public static class AHHealthcareInformation {

        private AHItemPeriod itemMaximumUsageAge;
        private AHItemPeriod itemMinimumUsageAge;
        private String itemUsageAgeDescription;
        private AHDataElement usageDuringBreastFeedingCode;
        private AHDataElement usageDuringPregnancyCode;
    }

    @Data
    @ToString
    public static class AHAlcoholInformation {

        private Double percentageOfAlcoholByVolume;
    }

    @Data
    @ToString
    public static class AHReferencedFileDetailInformation {

        private AHDataElement typeCode;
        private String uniformResourceIdentifier;
    }

    @Data
    @ToString
    public static class AHRegulatoryInformation {

        private List<String> permitIdentification;
        private List<AHDataElement> regulationTypeCode;
    }

    @Data
    @ToString
    public static class AHHealthRelatedInformation {

        private List<String> compulsoryAdditiveLabelInformation;
        private List<String> healthClaimDescription;
        private String sunProtectionFactor;
    }

    @Data
    @ToString
    public static class AHAllergenInformationWrapper {

        private List<AHAllergenInformation> items;
        private String statement;

    }

    @Data
    @ToString
    public static class AHConsumerInstructions {

        private List<String> storageInstructions;
        private List<String> usageInstructions;
    }

    @Data
    @ToString
    public static class AHNutritionalInformationWrapper {

        private List<AHNutrientHeader> nutrientHeaders;
        private List<String> nutritionalClaim;
    }

    @Data
    @ToString
    public static class AHPackagingMarking {

        private List<AHDataElement> localPackagingMarkedLabelAccreditationCodeReference;
        private List<AHDataElement> labelAccreditationCode;
    }

    @Data
    @ToString
    public static class AHProductDescription {

        private List<String> regulatedProductName;
    }

    @Data
    @ToString
    public static class AHAdditionalTradeItemIdentification {

        private String value;
        private AHDataElement typeCode;
    }

    @Data
    @ToString
    public static class AHSalesInformation {

        private List<AHDataElement> consumerSalesConditionCode;
    }
}
