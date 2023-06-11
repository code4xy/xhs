package com.xy.xhs.common.pipeline.context;

import com.xy.xhs.common.pipeline.BizEnum;
import com.xy.xhs.common.pipeline.selector.FilterSelector;

public interface EventContext {

  /**
   * 获取业务编码
   * @return
   */
  BizEnum getBizCode();

  /**
   * 获取过滤器选择器
   * @return
   */
  FilterSelector getFilterSelector();

  /**
   * 是否继续链
   * @return
   */
  boolean continueChain();

}
