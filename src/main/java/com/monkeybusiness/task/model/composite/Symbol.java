package com.monkeybusiness.task.model.composite;

public class Symbol implements Component {
  private final char symbol;
  private final ComponentType componentEnum = ComponentType.SYMBOL;

  public Symbol(char symbol) {
    this.symbol = symbol;
  }

  @Override
  public void add(Component component) {
    throw new UnsupportedOperationException("You cannot do it, useless user");
  }

  @Override
  public void remove(Component component) {
    throw new UnsupportedOperationException("You cannot do it, useless user");
  }

  @Override
  public ComponentType getComponentType() {
    return componentEnum;
  }

  @Override
  public Component getChild(int index) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int size() {
    return 1;
  }

  @Override
  public String toString() {
    return String.valueOf(symbol);
  }
}
