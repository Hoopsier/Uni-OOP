package app;

public class Person {
  private String name;
  private String city;
  private int age;

  public Person(String _name, String _city, int _age) {
    name = _name;
    city = _city;
    age = _age;
  }

  public int getAge() {
    return age;
  }

  public String getName() {
    return name;
  }

  public String getCity() {
    return city;
  }

  public String toString() {
    return String.format("Name: %s\nAge: %d\nCity: %s", name, age, city);
  }
}
