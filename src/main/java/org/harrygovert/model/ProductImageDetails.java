package org.harrygovert.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ProductImageDetails {

    private int width;
    private int height;
    private String url;
}
