package org.harrygovert.model.ah;

import java.util.List;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AHHealthWellnessPackagingMarking {

    private List<AHDataElement> packagingMarkedDietAllergenCode;
    private List<AHDataElement> packagingMarkedFreeFromCode;
}
