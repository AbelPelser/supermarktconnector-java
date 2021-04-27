package org.harrygovert.model.jumbo;

import java.util.List;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class JumboAdvertisements {

    private List<JumboAdvertisement> data;

    @Data
    @ToString
    public static class JumboAdvertisement {

        private int position;
        private String adUnitIdAndroid;
        private String adUnitIdiPhone;
        private String adUnitIdiPad;
    }
}
