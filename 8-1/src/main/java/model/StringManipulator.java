package model;

public class StringManipulator {
  public static String concatenate(String first, String second) {
    return first.concat(second);
  }

  public static int findLength(String string) {
    return string.length();
  }

  public static String convertToUpper(String string) {
    return string.toUpperCase();
  }

  public static String convertToLower(String string) {
    return string.toLowerCase();
  }

  public static boolean containsSubstring(String string, String subString) {
    return string.contains(subString);
  }
}
