package com.monkeybusiness.task.util.parser.impl;

import com.monkeybusiness.task.model.composite.Component;
import com.monkeybusiness.task.model.composite.ComponentType;
import com.monkeybusiness.task.model.composite.Text;

public class LexemeParser extends AbstractParser{
  private static final String LEXEME_REGEX = "\\s";
  private static final AbstractParser parser = new SymbolParser();

  @Override
  public Component parse(String message) {
    Text text = new Text(ComponentType.SENTENCE);
    String[] lexemeText = message.split(LEXEME_REGEX);
    for (String lexeme : lexemeText) {
      Component result = parser.parse(lexeme);
      text.add(result);
    }
    return text;
  }
}
