package org.harrygovert.model.ah;

import java.util.List;
import lombok.Data;
import lombok.ToString;
import org.harrygovert.model.ProductImageDetails;

@Data
@ToString
public class AHCategory {

    private Integer id;
    private String name;
    private List<ProductImageDetails> images;
    private Boolean nix18;
}
