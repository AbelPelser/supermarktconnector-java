package org.harrygovert.model.ah;

import java.util.List;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AHSubCategoryDetails {

    private AHCategory parent;
    private List<AHCategory> children;
}
