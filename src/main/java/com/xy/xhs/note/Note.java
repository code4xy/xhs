package com.xy.xhs.note;

import java.util.List;
import lombok.Data;
import org.springframework.lang.Nullable;

@Data
public class Note {
  private long id;
  private String title;
  private String content;
  private List<String> photoList;
  private int likeCount;
  @Nullable
  private String place;

  //ToDo # @
}
