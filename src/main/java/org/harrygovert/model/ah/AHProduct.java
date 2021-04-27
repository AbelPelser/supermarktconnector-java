package org.harrygovert.model.ah;

import java.time.LocalDate;
import java.util.List;
import lombok.Data;
import lombok.ToString;
import org.harrygovert.model.ProductImageDetails;

@Data
@ToString
public class AHProduct {

    private Integer webshopId;
    private Integer hqId;
    private String title;
    private String salesUnitSize;
    private Double currentPrice;
    private Double priceBeforeBonus;
    private List<ProductImageDetails> images;
    private String mainCategory;
    private String subCategory;
    private Integer subCategoryId;
    private String orderAvailabilityStatus;
    private String orderAvailabilityDescription;
    private String brand;
    private String shopType;
    private Boolean availableOnline;
    private Boolean isPreviouslyBought;
    private String descriptionHighlights;
    private List<String> propertyIcons;
    private AHProductProperties properties;
    private Boolean nix18;
    private Boolean isStapelBonus;
    private List<String> extraDescriptions;
    private Boolean isBonus;
    private String descriptionFull;
    private Boolean isOrderable;
    private Boolean isInfiniteBonus;
    private Boolean isSample;
    private Boolean isSponsored;

    private String unitPriceDescription;
    private LocalDate bonusStartDate;
    private LocalDate bonusEndDate;
    private String discountType;
    private String segmentType;
    private String promotionType;
    private String bonusMechanism;
    private String bonusPeriodDescription;
    private Integer bonusSegmentId;
    private Integer hqPromotionId;
    private String bonusSegmentDescription;
    private Boolean isBonusPrice;


    // Custom getters/setters because Lombok does not handle boolean members with names starting with "is" well
    public Boolean isIsPreviouslyBought() {
        return isPreviouslyBought;
    }

    public void setIsPreviouslyBought(boolean previouslyBought) {
        isPreviouslyBought = previouslyBought;
    }

    public Boolean isIsStapelBonus() {
        return isStapelBonus;
    }

    public void setIsStapelBonus(boolean stapelBonus) {
        isStapelBonus = stapelBonus;
    }

    public Boolean isIsBonus() {
        return isBonus;
    }

    public void setIsBonus(boolean bonus) {
        isBonus = bonus;
    }

    public Boolean isIsOrderable() {
        return isOrderable;
    }

    public void setIsOrderable(boolean orderable) {
        isOrderable = orderable;
    }

    public Boolean isIsInfiniteBonus() {
        return isInfiniteBonus;
    }

    public void setIsInfiniteBonus(boolean infiniteBonus) {
        isInfiniteBonus = infiniteBonus;
    }

    public Boolean isIsSample() {
        return isSample;
    }

    public void setIsSample(boolean sample) {
        isSample = sample;
    }

    public Boolean isIsSponsored() {
        return isSponsored;
    }

    public void setIsSponsored(boolean sponsored) {
        isSponsored = sponsored;
    }

    public Boolean isIsBonusPrice() {
        return isBonusPrice;
    }

    public void setIsBonusPrice(boolean bonusPrice) {
        isBonusPrice = bonusPrice;
    }
}
