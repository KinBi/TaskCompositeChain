package com.monkeybusiness.task.model.composite;

import java.util.ArrayList;
import java.util.List;

public class Text implements Component{
  public static final char SPACE = ' ';
  public static final String PARAGRAPH_SEPARATOR = "\t";
  public static final String NEW_LINE = "\n";
  private List<Component> componentList = new ArrayList<>();
  private final ComponentType componentType;

  public Text(ComponentType componentEnum) {
    this.componentType = componentEnum;
  }

  @Override
  public void add(Component component) {
    componentList.add(component);
  }

  @Override
  public void remove(Component component) {
    componentList.remove(component);
  }

  @Override
  public ComponentType getComponentType() {
    return componentType;
  }

  @Override
  public Component getChild(int index) {
    return componentList.get(index);
  }

  @Override
  public int size() {
    return componentList.size();
  }

  public String toString() {
    final StringBuilder sb = new StringBuilder();
    if (!componentList.isEmpty()) {
      for (Component component : componentList) {
        ComponentType componentType = component.getComponentType();
        if (componentType == ComponentType.PARAGRAPH) {
          sb.append(NEW_LINE);
          sb.append(PARAGRAPH_SEPARATOR);
        } else if (componentType == ComponentType.LEXEME) {
          sb.append(SPACE);
        }
        sb.append(component.toString());
      }
    }
    return sb.toString();
  }
}
