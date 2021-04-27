package org.harrygovert.model.ah;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AHAllergenInformation {

    private AHDataElement typeCode;
    private AHDataElement levelOfContainmentCode;

}