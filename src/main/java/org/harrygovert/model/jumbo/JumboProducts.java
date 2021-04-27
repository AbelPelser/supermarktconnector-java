package org.harrygovert.model.jumbo;

import java.util.List;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class JumboProducts {

    private List<JumboProduct> data;
    private int total;
    private int offset;
}
