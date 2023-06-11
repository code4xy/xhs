package com.xy.xhs.common.pipeline.selector;

import java.util.List;

public interface FilterSelector {

  boolean matchFilter(String currentFilterName);

  List<String> getFilterNames();
}
