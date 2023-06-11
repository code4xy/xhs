package com.xy.xhs.common.pipeline.selector;


import com.xy.xhs.common.pipeline.BizEnum;

public interface BizAware {

  /**
   * 获取当前业务编码
   * @return
   */
  BizEnum getBizCode();
}
