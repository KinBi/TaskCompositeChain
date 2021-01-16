package com.monkeybusiness.task.util.parser.impl;

import com.monkeybusiness.task.model.composite.Component;
import com.monkeybusiness.task.model.composite.ComponentType;
import com.monkeybusiness.task.model.composite.Text;

public class SentenceParser extends AbstractParser{
  private static final String SENTENCE_REGEX = "(?<=[.?!]\\s)";
  private static final AbstractParser parser = new LexemeParser();

  @Override
  public Component parse(String message) {
    Text text = new Text(ComponentType.PARAGRAPH);
    String[] sentenceText = message.split(SENTENCE_REGEX);
    for (String sentence : sentenceText) {
      Component result = parser.parse(sentence);
      text.add(result);
    }
    return text;
  }
}
