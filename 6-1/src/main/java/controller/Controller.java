package controller;

import app.App;
import model.Dictionary;

public class Controller {
  Dictionary dictionary = new Dictionary();

  public void addWord(String word, String desc) {
    System.out.println("tried");
    dictionary.addWord(word, desc);
  }

  public void search(String word) {
    App.setResult(dictionary.search(word));
  }
}
