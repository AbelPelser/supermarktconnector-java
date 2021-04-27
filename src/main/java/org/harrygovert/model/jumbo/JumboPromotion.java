package org.harrygovert.model.jumbo;

import java.time.Instant;
import java.util.List;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class JumboPromotion {

    private String id;
    private String name;
    private Instant fromDate;
    private Instant toDate;
    private String validityPeriod;
    private String summary;
    private String priceInformation;
    private boolean offline;
    private List<JumboPromotionTag> tags;
    // Unknown
    private List<String> stickerBadges;
    private boolean enablePromoAssistance;
    private JumboPromotionImage promotionImage;
    private int maxApplications;
    private JumboPromotionImage badgeImage;
    private String tag;
    private String additionalTag;

    @Data
    @ToString
    public static class JumboPromotionTag {

        private String type;
        private String text;
    }

    @Data
    @ToString
    public static class JumboPromotionImage {

        private String main;
    }
}
