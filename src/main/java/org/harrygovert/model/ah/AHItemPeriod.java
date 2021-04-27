package org.harrygovert.model.ah;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AHItemPeriod {

    private String value;
    private AHDataElement timeMeasurementUnitCode;
}
