package com.monkeybusiness.task.composite;

public interface Component {
  void add(Component component);
  void remove(Component component);
  ComponentEnum getComponentType();
  String toString();
}
