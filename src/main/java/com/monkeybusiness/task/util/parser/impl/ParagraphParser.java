package com.monkeybusiness.task.util.parser.impl;

import com.monkeybusiness.task.model.composite.Component;
import com.monkeybusiness.task.model.composite.ComponentType;
import com.monkeybusiness.task.model.composite.Text;

public class ParagraphParser extends AbstractParser {
  public static final String PARAGRAPH_REGEX = "\\n\\s{4}?|\\s{4}|\\t";
  private final AbstractParser parser = new SentenceParser();

  @Override
  public Component parse(String message) {
    Text text = new Text(ComponentType.TEXT);
    String[] paragraphText = message.split(PARAGRAPH_REGEX);
    for (String paragraph : paragraphText) {
      Component result = parser.parse(paragraph);
      text.add(result);
    }
    return text;
  }
}