package com.monkeybusiness.task.composite;

import java.util.ArrayList;
import java.util.List;

public class Text implements Component{
  public static final char SPACE = ' ';
  public static final String PARAGRAPH_SEPARATOR = "\t";
  public static final String NEW_LINE = "\n";
  private List<Component> list = new ArrayList<>();
  private final ComponentEnum componentEnum;

  public Text(ComponentEnum componentEnum) {
    this.componentEnum = componentEnum;
  }

  @Override
  public void add(Component component) {
    list.add(component);
  }

  @Override
  public void remove(Component component) {
    list.remove(component);
  }

  @Override
  public ComponentEnum getComponentType() {
    return componentEnum;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Text{");
    sb.append("list=").append(list);
    sb.append(", componentEnum=").append(componentEnum);
    sb.append('}');
    return sb.toString();
  }
}
