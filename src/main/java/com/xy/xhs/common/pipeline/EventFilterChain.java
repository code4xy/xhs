package com.xy.xhs.common.pipeline;


import com.xy.xhs.common.pipeline.context.EventContext;

public interface EventFilterChain<T extends EventContext> {


  /**
   * 事件处理流程
   * @param context
   */
  void handle(T context);

  /**
   * 开启下一个鉴权
   * @param ctx
   */
  void fireNext(T ctx);

}
