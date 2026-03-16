package com.mod1.app;

public class Cat {
  private String name;

  public Cat(String _name) {
    this.name = _name;
  }

  public void meow() {
    System.out.println("The cat named " + name + " says: Meow!");
  }
}
