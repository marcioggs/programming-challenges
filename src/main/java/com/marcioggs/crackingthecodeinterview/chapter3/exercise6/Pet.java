package com.marcioggs.crackingthecodeinterview.chapter3.exercise6;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public abstract class Pet {
  private String name;
}
