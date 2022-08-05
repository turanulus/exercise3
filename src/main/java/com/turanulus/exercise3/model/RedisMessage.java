package com.turanulus.exercise3.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RedisMessage implements Serializable {
  private String id; // Message id
  private String title; // Message title
  private String content; // Message content
  private String statusCode; // 4000 for success, 4001 for failure
}
