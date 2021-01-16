package com.monkeybusiness.task;

import com.monkeybusiness.task.exception.DataReaderException;
import com.monkeybusiness.task.model.composite.Component;
import com.monkeybusiness.task.model.service.impl.TextServiceImpl;
import com.monkeybusiness.task.util.parser.impl.ParagraphParser;
import com.monkeybusiness.task.util.reader.DataReader;

public class Main {
  public static void main(String[] args) {
    String text = "    It has survived - not only (five) centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the “Динамо” (Рига) with the release of Letraset sheets.toString() containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker Faclon9 including versions of Lorem Ipsum!\n" +
            "    It is a long a!=b established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Ipsum is that it has a more-or-less normal distribution ob.toString(a?b:c), as opposed to using (Content here), content here's, making it look like readable English?\n" +
            "    It is a established fact that a reader will be of a page when looking at its layout...\n" +
            "    Bye бандерлоги.";
    DataReader dataReader = new DataReader();
    String ss = "";
    try {
      ss = dataReader.readFromFile("erefe");
//      System.out.println(ss);
    } catch (DataReaderException e) {
      e.printStackTrace();
    }
    ParagraphParser parser = new ParagraphParser();
    Component text1 = parser.parse(ss);
//    System.out.println(text1.toString());
    TextServiceImpl textService = new TextServiceImpl();
    textService.sortParagraphs(text1);
    System.out.println(text1);
    textService.deleteSentencesWithWordsCountLessThan(text1, 2);
    System.out.println(text1);
  }
}
