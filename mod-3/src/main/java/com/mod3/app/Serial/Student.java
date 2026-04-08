package com.mod3.app.Serial;

import java.io.Serializable;

public class Student implements Serializable {
  public String name;
  public int age;
  public int id;

  public Student() {
    name = "";
    age = 0;
    id = 0;
  }

  public Student(String name, int age, int id) {
    this.name = name;
    this.age = age;
    this.id = id;
  }

  @Override
  public String toString() {
    return name + " " + age + " " + id + " ";
  }
}
