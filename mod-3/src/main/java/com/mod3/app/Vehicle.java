package com.mod3.app;

interface IVehicle {
  void start();

  void stop();

  void getInfo();
}

abstract class Vehicle implements IVehicle {
  float fuel;
  float speed;

  abstract void drainFuel();

  abstract void charge();
}

class Car extends Vehicle {

  public void charge() {
    System.out.println("This Vehicle cannot charge");
  }

  public void drainFuel() {
    System.out.println("Drained fuel");
  }

  public void start() {
    System.out.println("Car started");
  }

  public void stop() {
    System.out.println("Car stopped");
  }

  public void getInfo() {
    System.out.println("Car's' info");
  }
}

class Motorcycle extends Vehicle {
  public void charge() {
    System.out.println("This Vehicle cannot charge");
  }

  public void start() {
    System.out.println("Motorcycle started");
  }

  public void stop() {
    System.out.println("Motorcycle stopped");
  }

  public void getInfo() {
    System.out.println("Motorcycle's' info");
  }
}

class Bus extends Vehicle {
  public void charge() {
    System.out.println("This Vehicle cannot charge");
  }

  public void start() {
    System.out.println("Bus started");
  }

  public void stop() {
    System.out.println("Bus stopped");
  }

  public void getInfo() {
    System.out.println("Bus's' info");
  }
}
