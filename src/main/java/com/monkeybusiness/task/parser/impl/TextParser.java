package com.monkeybusiness.task.parser.impl;

import com.monkeybusiness.task.composite.Component;
import com.monkeybusiness.task.parser.Parser;

public class TextParser extends AbstractParser{

  public TextParser(Parser nextParser) {
    super(nextParser);
  }

  @Override
  public Component parse(String message) {
    return null;
  }
}
