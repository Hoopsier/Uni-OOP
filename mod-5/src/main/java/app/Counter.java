package app;

public class Counter extends Thread {
  private int number;
  private int range;

  public Counter(int num, int _range) {
    number = num;
    range = _range;
  }

  public void add() {
    number += 2;
  }

  public String getCurrent() {
    return String.valueOf(number);
  }

  public void run() {
    try {
      for (int i = 0; i < range; i++) {
        System.out.println(getCurrent());
        add();
        Thread.sleep(200);
      }
    } catch (InterruptedException e) {
      return;
    }
  }
}
