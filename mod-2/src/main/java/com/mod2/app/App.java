package com.mod2.app;

/**
 * Hello world!
 */
public class App {
  public static void main(String[] args) {
    // one();
    // two();
    // three();
    four();
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
