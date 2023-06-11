package com.xy.xhs.common.pipeline;

public enum BizEnum {
  TRAFFIC_EVENT(1, "业务1"),
  METRIC_EVENT(2,"业务2"),
  SIGNAL_EVENT(3,"业务3")
  ;

  BizEnum(Integer code, String name) {
    this.code = code;
    this.name = name;
  }

  private Integer code;
  private String name;

  public Integer getCode() {
    return this.code;
  }

  public String getName() {
    return this.name;
  }

  public static BizEnum of(Integer code) {
    for (BizEnum value : BizEnum.values()) {
      if (value.code == code) {
        return value;
      }
    }
    return null;
  }
}
