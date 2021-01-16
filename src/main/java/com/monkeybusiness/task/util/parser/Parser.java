package com.monkeybusiness.task.util.parser;

import com.monkeybusiness.task.model.composite.Component;

public interface Parser {
  Component parse(String text);
}
