package com.mod3.app;

interface IVehicle {
  void start();

  void stop();

  void getInfo();
}

interface IEVehicle extends IVehicle {
  void charge();
}

abstract class Vehicle implements IVehicle {
  float fuel;
  float speed;
}

abstract class EVehicle extends Vehicle implements IEVehicle {
  float charge;
}

class Car extends Vehicle {

  public void charge() {
    System.out.println("This Vehicle cannot charge");
  }

  public void start() {
    System.out.println("Car started");
  }

  public void stop() {
    System.out.println("Car stopped");
  }

  public void getInfo() {
    System.out.println("Car's info");
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
    System.out.println("Motorcycle's info");
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
    System.out.println("Bus's info");
  }
}

class EMotorcycle extends EVehicle {
  public void charge() {
    System.out.println("EMotorcycle got charged");
  }

  public void start() {
    System.out.println("EMotorcycle started");
  }

  public void stop() {
    System.out.println("EMotorcycle stopped");
  }

  public void getInfo() {
    System.out.println("EMotorcycle's info");
  }
}

class ECar extends EVehicle {
  public void charge() {
    System.out.println("ECar got charged");
  }

  public void start() {
    System.out.println("ECar started");
  }

  public void stop() {
    System.out.println("ECar stopped");
  }

  public void getInfo() {
    System.out.println("ECar's info");
  }
}
