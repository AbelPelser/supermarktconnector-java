package org.harrygovert.model.jumbo;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class JumboSearchResult {

    private JumboProducts products;
    private JumboFilters filters;
    private JumboHorizontalFilters horizontalFilters;
    private JumboSortOptions sortOptions;
    private JumboProductLists productLists;
    private JumboAdvertisements advertisements;
}
