package com.monkeybusiness.task.parser;

import com.monkeybusiness.task.composite.Component;

public interface Parser {
  Component parse(String text);
}
