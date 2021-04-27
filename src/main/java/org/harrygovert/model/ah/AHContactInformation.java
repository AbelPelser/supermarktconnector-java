package org.harrygovert.model.ah;

import java.util.List;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AHContactInformation {

    private String contactAddress;
    private String contactName;
    private List<AHCommunicationChannelWrapper> targetMarketCommunicationChannel;
    private AHDataElement contactTypeCode;

    @Data
    @ToString
    public static class AHCommunicationChannelWrapper {

        private List<AHCommunicationChannel> communicationChannel;

        @Data
        @ToString
        public static class AHCommunicationChannel {
            private AHDataElement code;
            private String name;
            private String value;
        }
    }
}
