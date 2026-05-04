package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

/**
 * Hello world!
 */
public class App {
  public static void main(String[] args) {
    two();
    // one();
  }

  private static void one() {
    int[] nuberts = new int[1000];
    for (int i = 0; i < nuberts.length; i++) {
      nuberts[i] = ThreadLocalRandom.current().nextInt(1, 3);
    }

    // Task starts here:
    double result = Arrays.stream(nuberts).average().getAsDouble();
    System.out.println(result);
  }

  private static void two() {
    List<Integer> nuberts = new ArrayList<>();
    for (int i = 0; i < 1000; i++) {
      nuberts.add(ThreadLocalRandom.current().nextInt(1, 11));
    }
    Stream<Integer> stream = nuberts.stream();
    double mean = stream.filter(i -> i % 2 == 0).map(x -> x * 2).mapToInt(Integer::intValue).sum();
    System.out.println(mean);
  }
}
