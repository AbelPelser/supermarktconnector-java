package org.harrygovert.model.ah;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AHSearchConfiguration {

    @Data
    @ToString
    private static class AHSearchConfigurationGoogleBanners {

        private String adUnitMainPath;
        private String adUnitSecondaryPath;
        private String customTemplateId;
        private String divGptAd;
    }

    private AHSearchConfigurationGoogleBanners googleBanners;
}