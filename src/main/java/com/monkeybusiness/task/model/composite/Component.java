package com.monkeybusiness.task.model.composite;

public interface Component {
  void add(Component component);
  void remove(Component component);
  ComponentType getComponentType();
  Component getChild(int index);
  int size();
  String toString();
}
