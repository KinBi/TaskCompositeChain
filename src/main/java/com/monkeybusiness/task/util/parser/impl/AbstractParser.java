package com.monkeybusiness.task.util.parser.impl;

import com.monkeybusiness.task.util.parser.Parser;

public abstract class AbstractParser implements Parser {
  private Parser nextParser;

  public void setNextParser(Parser nextParser) {
    this.nextParser = nextParser;
  }
}
