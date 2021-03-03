package com.karson.twitterclone.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TweetDisplay {
  private User user;
  private String date;
  private String message;
  private List<Tag> tags;
}
