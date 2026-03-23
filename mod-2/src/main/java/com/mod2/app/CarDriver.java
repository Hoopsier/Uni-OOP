package com.mod2.app;

public class CarDriver {
  public void run() {
    Car car = new Car("AFs", 0, 1);
    boolean cc = car.ccOn(120, 130);
    System.out.println(car.getSpeed());
  }
}
