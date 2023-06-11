package com.xy.xhs.common.pipeline.context;

import com.xy.xhs.common.pipeline.BizEnum;
import com.xy.xhs.common.pipeline.selector.FilterSelector;

public abstract class AbstractEventContext implements EventContext{

  private final BizEnum bizEnum;
  private final FilterSelector selector;

  public AbstractEventContext(BizEnum bizEnum, FilterSelector selector) {
    this.bizEnum = bizEnum;
    this.selector = selector;
  }

  @Override
  public BizEnum getBizCode() {
    return bizEnum;
  }

  @Override
  public FilterSelector getFilterSelector() {
    return selector;
  }
}
