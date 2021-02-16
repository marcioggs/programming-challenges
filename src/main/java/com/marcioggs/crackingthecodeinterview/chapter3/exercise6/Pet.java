package com.marcioggs.crackingthecodeinterview.chapter3.exercise6;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Data
@SuperBuilder
public abstract class Pet {
  private String name;
  private LocalDateTime receivedDateTime;
}
