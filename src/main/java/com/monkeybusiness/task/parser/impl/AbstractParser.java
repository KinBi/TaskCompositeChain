package com.monkeybusiness.task.parser.impl;

import com.monkeybusiness.task.parser.Parser;

public abstract class AbstractParser implements Parser {
  private Parser nextParser;

  public void setNextParser(Parser nextParser) {
    this.nextParser = nextParser;
  }
}
