package com.mod3.app.Serial;

import java.io.Serializable;

public class Enrollment implements Serializable {
  public Student student;
  public Course course;
  public String date;

  public Enrollment() {
    student = null;
    course = null;
    date = "";
  }

  public Enrollment(Student stud, Course curse, String deit) {
    student = stud;
    course = curse;
    date = deit;
  }

  @Override
  public String toString() {
    return student + " " + course + " " + date + " ";
  }
}
