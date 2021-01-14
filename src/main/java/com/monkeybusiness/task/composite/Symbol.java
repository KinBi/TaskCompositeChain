package com.monkeybusiness.task.composite;

public class Symbol implements Component{
  private final char symbol;
  private final ComponentEnum componentEnum = ComponentEnum.SYMBOL;

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
  public ComponentEnum getComponentType() {
    return componentEnum;
  }

  @Override
  public String toString() {
    return String.valueOf(symbol);
  }
}
