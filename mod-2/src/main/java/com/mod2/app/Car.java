package com.mod2.app;

public class Car {
  public double speed;
  private double gasolineLevel;
  private String typeName;
  private boolean cruiseControl;
  public float gasLoss;

  public Car() {
    speed = 0;
    gasolineLevel = 1;
    this.gasLoss = 5;
    this.typeName = "default";
  }

  public Car(String typeName) {
    speed = 0;
    gasolineLevel = 1;
    this.gasLoss = 5;
    this.typeName = typeName;
  }

  public Car(String typeName, double speed, double gasolineLevel) {
    this.speed = speed;
    this.gasolineLevel = gasolineLevel;
    this.typeName = typeName;
    this.gasLoss = 5;
  }

  public boolean ccOn(int min, int max) {
    cruiseControl = true;
    System.out.println("asd");
    if (gasolineLevel <= 0) {
      System.out.println("Out of gas");
      return false;
    }
    while (speed < min) {
      System.out.println("abd");
      accelerate();
    }
    while (speed > max) {
      System.out.println("csd");
      decelerate();
    }
    return true;
  }

  public void ccOff() {
    cruiseControl = false;
  }

  public boolean getCruiseControl() {
    return cruiseControl;
  }

  public void accelerate() {
    if (gasolineLevel > 0)
      speed += 10;
    else
      speed = 0;
  }

  void decelerate() {
    if (gasolineLevel > 0) {
      if (10 > 0)
        speed = Math.max(0, speed - 10);
    } else
      speed = 0;
  }

  double getSpeed() {
    return speed;
  }

  String getTypeName() {
    return typeName;
  }

  void fillTank() {
    gasolineLevel = 100;
  }

  void loseGas() {
    gasolineLevel -= gasLoss;
  }

  double getGasolineLevel() {
    return gasolineLevel;
  }
}
