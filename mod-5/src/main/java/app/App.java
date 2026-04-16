package app;

import java.util.Arrays;
import java.util.Random;

/**
 * Hello world!
 */
public class App {
  public static void main(String[] args) {
    // two();
    // three();
    four();
  }

  // Sync 1
  private static void four() {
    Reservee reservee = new Reservee();
    for (int i = 0; i < 20; i++) {
      Customer customer = new Customer(reservee, i);
      customer.start();
    }
  }

  private static void one() {
    final int range = 18;
    new Counter(1, range).start();
    new Counter(2, range).start();
  }

  private static void two() {
    final int size = 120000;
    Integer[] numbers = new Integer[size];
    Random random = new Random();
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = random.nextInt(0, 1000000);
    }
    int processorCount = Runtime.getRuntime().availableProcessors();
    Adder[] threads = new Adder[processorCount];
    int chunkSize = size / processorCount;
    for (int i = 0; i < processorCount; i++) {
      int start = i * chunkSize;
      int end = (i == processorCount - 1) ? size : start + chunkSize;
      threads[i] = new Adder(Arrays.copyOfRange(numbers, start, end));
    }
    for (Adder thread : threads) {
      thread.start();
    }
    long sum = 0;
    for (Adder thread : threads) {
      try {
        thread.join(); // AI gave me this to use, it waits for the thread to die, instead of polling
                       // until the sum isn't zero
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
      sum += thread.getSum();
    }
    System.out.println(sum);
  }

  private static void three() {

  }
}
