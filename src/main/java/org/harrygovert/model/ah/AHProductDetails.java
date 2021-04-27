package org.harrygovert.model.ah;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AHProductDetails {

    private String productId;
    private AHProduct productCard;
    private AHTradeItem tradeItem;
    private AHProductProperties properties;
    private String disclaimerText;
}
