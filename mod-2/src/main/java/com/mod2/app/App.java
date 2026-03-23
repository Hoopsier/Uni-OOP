package com.mod2.app;

/**
 * Hello world!
 */
public class App {
  // NOTE: I understand why you would stuff the testing code into the methods, but
  // I don't care, since this is easier.
  public static void main(String[] args) {
    // one();
    // two();
    // three();
    // four();
    fivesixseven();
  }

  private static void fivesixseven() {
    GroceryListManager glm = new GroceryListManager();
    glm.addItem("asdsad", 123, "cats");
    glm.checkItem("asdsad");
    glm.removeItem("asdsad");
    glm.addItem("asdgad", 32, "cats");
    glm.addItem("asdsad", 532, "cats");
    glm.addItem("asdsfd", 1, "cats");
    glm.addItem("asdsaa", 53, "dogs");
    glm.displayList();
    System.out.println("========");
    glm.displayCategory("cats");
    System.out.println("========");
    glm.displayCategory("dogs");
  }

  private static void four() {
    CarDriver cd = new CarDriver();
    cd.run();
  }

  private static void three() {
    CoffeeMachineDriver cmd = new CoffeeMachineDriver(new CoffeeMachine());
    cmd.test();
  }

  private static void two() {
    Car myCar = new Car("Goober");
    Car yourCar = new Car("Gofer", 15, 88);
    System.out.println(myCar.getSpeed() + "\n" + yourCar.getSpeed());
  }

  private static void one() {
    TelevisionViewer vw = new TelevisionViewer();
    vw.Start();
  }
}
