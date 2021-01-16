package com.monkeybusiness.task.model.service.impl;

import com.monkeybusiness.task.exception.DataReaderException;
import com.monkeybusiness.task.model.composite.Component;
import com.monkeybusiness.task.model.composite.Text;
import com.monkeybusiness.task.model.service.TextService;
import com.monkeybusiness.task.util.parser.impl.ParagraphParser;
import com.monkeybusiness.task.util.reader.DataReader;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TextServiceImplTest {
  Component text;
  String sortedText;
  TextService service;
  @BeforeClass
  public void setUp() throws DataReaderException {
    sortedText = "\n\t " +
            "\n\t It is a established fact that a reader will be of a page when looking at its layout..." +
            "\n\t Bye бандерлоги." +
            "\n\t It has survived - not only (five) centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the “Динамо” (Рига) with the release of Letraset sheets.toString() containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker Faclon9 including versions of Lorem Ipsum!" +
            "\n\t It is a long a!=b established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Ipsum is that it has a more-or-less normal distribution ob.toString(a?b:c), as opposed to using (Content here), content here's, making it look like readable English?";
    text = new ParagraphParser().parse(new DataReader().readFromFile(""));
    service = new TextServiceImpl();
  }

  @Test
  public void testSortParagraphs() {
    service.sortParagraphs(text);
    String actual = text.toString();
    String expected = sortedText;
    assertEquals(actual, expected);
  }

}