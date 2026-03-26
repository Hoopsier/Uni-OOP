package com.mod3.app;

import java.util.*;

class VehicleDemo {

  public void getInfo(List<IVehicle> vehicles) {
    for (IVehicle vehicle : vehicles) {
      vehicle.start();
      vehicle.stop();
      vehicle.getInfo();
    }
  }
}
