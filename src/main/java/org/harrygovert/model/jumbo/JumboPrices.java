package org.harrygovert.model.jumbo;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class JumboPrices {

    private JumboPrice price;
    private JumboPrice promotionalPrice;
    private JumboUnitPrice unitPrice;

    @Data
    @ToString
    public static class JumboPrice {

        private String currency;
        private int amount;
    }

    @Data
    @ToString
    public static class JumboUnitPrice {

        private String unit;
        private JumboPrice price;
    }
}
