package app;

public class Adder extends Thread {
  private Integer[] numbers;
  private int theSum = 0;

  public Adder(Integer[] _numbers) {
    numbers = _numbers;
  }

  public void run() {
    int sum = 0;
    for (int i = 0; i < numbers.length; i++) {
      sum += numbers[i];
    }
    theSum = sum;
  }

  public int getSum() {
    return theSum;
  }
}
