package model;

public class PalindromeChecker {

  // NOTE: the code is dirty, but it works, and I learned some bs stuff in the for
  // loop.
  public boolean isPalindrome(String word) {
    StringBuilder stringBuilder = new StringBuilder();
    String sterilized = String.copyValueOf(word.toCharArray()).toLowerCase();
    sterilized = sterilized.replace(",", "");
    sterilized = sterilized.replace(" ", "");
    stringBuilder.append(sterilized);
    String reversed = stringBuilder.reverse().toString();
    System.out.println("x" + sterilized + ":" + reversed + "x");
    char[] sterChars = sterilized.toCharArray();
    char[] revChars = reversed.toCharArray();
    System.out.println(revChars[1] == sterChars[1]);
    for (int i = 0; i < sterChars.length - 1; i++) {
      if (revChars[i] != sterChars[i]) {
        return false;
      }
    }
    return true;
  }
}
