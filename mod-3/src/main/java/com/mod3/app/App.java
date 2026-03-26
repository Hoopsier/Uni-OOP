package com.mod3.app;

import java.util.*;

public class App {
  public static void main(String[] args) {
    one();
  }

  /// NOTE: This is 3.2 task 1
  private static void one() {
    List<IEVehicle> eVehicles = new ArrayList<>();
    List<IVehicle> vehicles = new ArrayList<>();
    vehicles.add(new Car());
    vehicles.add(new Bus());
    vehicles.add(new Motorcycle());
    eVehicles.add(new EMotorcycle());
    eVehicles.add(new ECar());
    VehicleDemo demo = new VehicleDemo();
    demo.getInfo(vehicles, eVehicles);
  }
}
