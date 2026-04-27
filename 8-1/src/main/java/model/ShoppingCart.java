package model;

import java.util.ArrayList;
import java.util.List;

import org.javatuples.Pair;

public class ShoppingCart {
  private List<Pair<String, Double>> items;

  ShoppingCart() {
    items = new ArrayList<>();
  }

  public void addToCart(String name, double price) {
    items.add(Pair.with(name, price));
  }

  public void removeFromCart(String name) {
    for (Pair<String, Double> pair : items) {
      if (pair.getValue0() != name) {
        continue;
      }
      items.remove(pair);
      break;
    }
  }

  public int getSize() {
    return items.size();
  }

  public double getValue() {
    double sum = 0;
    for (Pair<String, Double> pair : items) {
      sum += pair.getValue1();
    }
    return sum;
  }
}
