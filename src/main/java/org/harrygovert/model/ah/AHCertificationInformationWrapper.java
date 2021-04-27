package org.harrygovert.model.ah;

import java.util.List;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AHCertificationInformationWrapper {

    private String agency;
    private List<AHCertificationInformation> items;

    @Data
    @ToString
    public static class AHCertificationInformation {

        private String value;
    }
}
