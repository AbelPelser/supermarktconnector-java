package org.harrygovert.model.jumbo;

import java.util.List;
import lombok.Data;
import lombok.ToString;
import org.harrygovert.model.ProductImageDetails;

@Data
@ToString
public class JumboProduct {

    private String id;
    private String title;
    private List<QuantityDetails> quantityOptions;
    private JumboPrices prices;
    private boolean available;
    private String productType;
    private List<String> crossSellSKUList;
    private String quantity;
    private ImageInfo imageInfo;
    private String unavailabilityReason;
    private String reason;
    private JumboPromotion promotion;
    private boolean isPromoted;

    public boolean isIsPromoted() {
        return isPromoted;
    }

    public void setIsPromoted(boolean promoted) {
        isPromoted = promoted;
    }

    @Data
    @ToString
    public static class QuantityDetails {

        private int defaultAmount;
        private int minimumAmount;
        private int amountStep;
        private String unit;
        private int maximumAmount;
    }

    @Data
    @ToString
    public static class ImageInfo {

        private List<ProductImageDetails> primaryView;
    }
}
