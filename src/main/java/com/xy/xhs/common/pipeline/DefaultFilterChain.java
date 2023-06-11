package com.xy.xhs.common.pipeline;

import com.xy.xhs.common.pipeline.context.EventContext;
import java.util.Objects;

public class DefaultFilterChain<T extends EventContext> implements EventFilterChain<T> {

  private EventFilterChain<T> next;
  private EventFilter<T> filter;

  public DefaultFilterChain(EventFilterChain chain, EventFilter filter) {
    this.next = chain;
    this.filter = filter;
  }

  @Override
  public void handle(T context) {
    filter.doFilter(context, this);
  }

  @Override
  public void fireNext(T ctx) {
    EventFilterChain nextChain = this.next;
    if (Objects.nonNull(nextChain)) {
      nextChain.handle(ctx);
    }
  }
}
