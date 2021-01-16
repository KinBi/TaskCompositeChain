package com.monkeybusiness.task.comparator;

import com.monkeybusiness.task.model.composite.Component;

import java.util.Comparator;

public class ParagraphSizeComparator implements Comparator<Component> {
  @Override
  public int compare(Component o1, Component o2) {
    return Integer.compare(o1.size(), o2.size());
  }
}
