package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/**
 * Hello world!
 */
public class App {
  public static void main(String[] args) {
    // one();
    two();
  }

  private static void two() {
    List<Integer> numbers = new ArrayList<>();
    Random rnd = new Random();
    DoublingService doublingService = nums -> {
      for (int i = 0; i < nums.size(); i++) {
        nums.set(i, nums.get(i) * 2);
      }
    };
    SummingSercive summingSercive = nums -> {
      int sum = 0;
      for (int num : nums) {
        sum += num;
      }
      return sum;
    };
    for (int i = 0; i < 117; i++) {
      numbers.add(rnd.nextInt(0, 118));
    }
    numbers.removeIf((number) -> number % 2 != 0);

    doublingService.doubleAll(numbers);

    System.out.println(summingSercive.getSum(numbers));

    // for (Integer integer : numbers) {
    // System.out.println(integer);
    // }
  }

  @FunctionalInterface
  interface DoublingService {
    void doubleAll(List<Integer> nums);
  }

  @FunctionalInterface
  interface SummingSercive {
    int getSum(List<Integer> nums);
  }

  private static void one() {
    List<Person> people = new ArrayList<>();
    Comparator<Person> personComparator = (person1, person2) -> {
      return person2.getAge() - person1.getAge();
    };
    Random rnd = new Random();
    for (int i = 0; i < 255; i++) {
      people.add(new Person("nonce", Integer.toString(rnd.nextInt(0, 16)), rnd.nextInt(0, 255)));
    }
    people.removeIf((p) -> !p.getCity().contains("7"));
    Collections.sort(people, personComparator);
    for (Person person : people) {
      System.out.println(person);
    }
  }
}
