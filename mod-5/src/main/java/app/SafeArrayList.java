package app;

import java.util.List;
import java.util.ArrayList;

class SafeArrayList {
  private List<Integer> list = new ArrayList<>();

  SafeArrayList() {
  }

  public synchronized void add(int val) {
    list.add(val);
  }

  public synchronized int getSize() {
    return list.size();
  }

  public synchronized void removeAtIndex(int i) {
    list.remove(i);
  }
}
