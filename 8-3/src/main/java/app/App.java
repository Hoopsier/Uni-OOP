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
