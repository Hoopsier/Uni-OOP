package com.mod3.app.Serial;

import java.io.Serializable;

public class Course implements Serializable {
  // NOTE: I don't have time for getters and setters right now, I am sick.
  public String code, name, instructor;

  public Course() {
    code = "";
    name = "";
    instructor = "";
  }

  public Course(String c, String n, String i) {
    code = c;
    name = n;
    instructor = i;
  }

  @Override
  public String toString() {
    return code + " " + name + " " + instructor + " ";
  }
}
