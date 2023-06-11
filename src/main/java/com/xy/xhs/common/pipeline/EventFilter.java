package com.xy.xhs.common.pipeline;

import com.xy.xhs.common.pipeline.context.EventContext;

public interface EventFilter<T extends EventContext> {

  void doFilter(T context, EventFilterChain chain);
}
