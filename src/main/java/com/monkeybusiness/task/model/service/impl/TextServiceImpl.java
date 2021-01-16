package com.monkeybusiness.task.model.service.impl;

import com.monkeybusiness.task.comparator.ParagraphSizeComparator;
import com.monkeybusiness.task.model.composite.Component;
import com.monkeybusiness.task.model.composite.ComponentType;
import com.monkeybusiness.task.model.service.TextService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TextServiceImpl implements TextService {

  @Override
  public void sortParagraphs(Component component) {
    while (component.getComponentType() != ComponentType.TEXT) {
      component = component.getChild(0);
    }
    ParagraphSizeComparator comparator = new ParagraphSizeComparator();
    sort(component, comparator);
  }

  @Override
  public void deleteSentencesWithWordsCountLessThan(Component component, int count) {
    if (component.getComponentType() == ComponentType.PARAGRAPH) {
      for (int i = 0; i < component.size(); i++) {
        Component sentence = component.getChild(i);
        for (int j = 0; j < sentence.size(); j++) {
          Component child = sentence.getChild(j);
          if (child.size() < count) {
            component.remove(sentence);
            i--;
            break;
          }
        }
      }
    } else {
      for (int i = 0; i < component.size(); i++) {
        deleteSentencesWithWordsCountLessThan(component.getChild(i), count);
      }
    }
  }

  private void sort(Component component, Comparator<Component> comparator) {
    int[] indexes = new int[component.size()];
    for (int i = 0; i < component.size(); i++) {
      indexes[i] = i;
    }
    for (int i = 0; i < component.size() - 1; i++) {
      for (int j = i + 1; j < component.size(); j++) {
        if (comparator.compare(component.getChild(indexes[i]), component.getChild(indexes[j])) > 0) {
          int tmp = indexes[i];
          indexes[i] = indexes[j];
          indexes[j] = tmp;
        }
      }
    }
    List<Component> childs = new ArrayList<>();
    for (int i = 0; i < component.size(); i++) {
      Component child = component.getChild(i--);
      childs.add(child);
      component.remove(child);
    }
    for (int i = 0; i < indexes.length; i++) {
      component.add(childs.get(indexes[i]));
    }
  }
}
