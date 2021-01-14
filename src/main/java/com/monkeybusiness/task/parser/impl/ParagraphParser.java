package com.monkeybusiness.task.parser.impl;

import com.monkeybusiness.task.composite.Component;
import com.monkeybusiness.task.composite.ComponentEnum;
import com.monkeybusiness.task.composite.Text;
public class ParagraphParser extends AbstractParser{
  public static final String PARAGRAPH_REGEX = "\\n(\\s){4}|\\s{4}|[\\t]+";
  private final AbstractParser parser = new SentenceParser();

  @Override
  public Component parse(String message) {
    Text text = new Text(ComponentEnum.PARAGRAPH);
    String[] sentenceText = message.split(PARAGRAPH_REGEX);
    for (String sentence : sentenceText) {
      Component result = parser.parse(sentence);
      text.add(result);
    }
    return parser.parse(message);
  }
}
