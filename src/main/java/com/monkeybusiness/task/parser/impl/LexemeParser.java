package com.monkeybusiness.task.parser.impl;

import com.monkeybusiness.task.composite.Component;

public class LexemeParser extends AbstractParser{
  public static final String LEXEME_REGEX = "\\s.+(\\s|$)";

  @Override
  public Component parse(String message) {
    return null;
  }
}
