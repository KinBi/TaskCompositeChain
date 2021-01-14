package com.monkeybusiness.task.parser.impl;

import com.monkeybusiness.task.composite.Component;

public class SentenceParser extends AbstractParser{
  public static final String SENTENCE_REGEX = ".*[?!.](\\s+\\p{Lu}.*|$)";


  @Override
  public Component parse(String message) {
    return null;
  }
}
