package model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StringManipulatorTest {
  @Test
  void canConcat() {
    assertEquals("123321", StringManipulator.concatenate("123", "321"));
  }

  @Test
  void hasLength() {
    assertEquals(5, StringManipulator.findLength("WASSS"));
  }

  @Test
  void canUpper() {
    assertEquals("WE GOOD", StringManipulator.convertToUpper("We good"));
  }

  @Test
  void canLower() {
    assertEquals("we good", StringManipulator.convertToLower("WE GOOD"));
  }

  @Test
  void canCheckSubstring() {
    assertEquals(true, StringManipulator.containsSubstring("The quick brown fox", "e q"));
  }
}
