package com.mod2.app;

import java.util.*;

public class GroceryListManager {
  private Map<String, Double> groceryList = new HashMap<>();
  private Map<String, Map<String, Double>> category = new HashMap<>();

  public void addItem(String item, double price, String category) {

    groceryList.put(item, price);
    if (!this.category.containsKey(category)) {
      this.category.put(category, new HashMap<>());
    }
    this.category.get(category).put(item, price);
  }

  // NOTE: not bothering with removing from a category rn...
  public void removeItem(String item) {
    groceryList.remove(item);
  }

  public void displayList() {
    System.out.println(groceryList);
  }

  public void displayCategory(String category) {
    System.out.println(this.category.get(category));
  }

  public void checkItem(String item) {
    if (groceryList.containsKey(item)) {
      System.out.println("It's on the list");
      return;
    }
    System.out.println("It's not on the list");
  }
}
