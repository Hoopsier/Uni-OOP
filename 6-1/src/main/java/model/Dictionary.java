
package model;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {

  private Map<String, String> words = new HashMap<>();

  public void addWord(String word, String desc) {
    words.put(word, desc);
    System.out.println(words);
  }

  public String search(String word) {
    return words.get(word);
  }
}
