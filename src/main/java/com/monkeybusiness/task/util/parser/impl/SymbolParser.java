package com.monkeybusiness.task.util.parser.impl;

import com.monkeybusiness.task.model.composite.Component;
import com.monkeybusiness.task.model.composite.ComponentType;
import com.monkeybusiness.task.model.composite.Symbol;
import com.monkeybusiness.task.model.composite.Text;

public class SymbolParser extends AbstractParser{

  @Override
  public Component parse(String message) {
    Text text = new Text(ComponentType.LEXEME);
    char[] symbolText = message.toCharArray();
    for (char element : symbolText) {
      Symbol symbol = new Symbol(element);
      text.add(symbol);
    }
    return text;
  }
}
