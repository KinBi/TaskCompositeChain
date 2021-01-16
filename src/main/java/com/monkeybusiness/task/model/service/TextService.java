package com.monkeybusiness.task.model.service;

import com.monkeybusiness.task.model.composite.Component;

public interface TextService {
  void sortParagraphs(Component component);

  void deleteSentencesWithWordsCountLessThan(Component component, int count);
}
