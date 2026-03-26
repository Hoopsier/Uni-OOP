package com.mod3.app;

import java.util.*;

class VehicleDemo {

  public void getInfo(List<IVehicle> vehicles, List<IEVehicle> eVehicles) {
    for (IVehicle vehicle : vehicles) {
      vehicle.start();
      vehicle.stop();
      vehicle.getInfo();
    }
    for (IEVehicle vehicle : eVehicles) { // NOTE: Could not figure out how to do this in one array. Will check with AI
                                          // if it is possible.
      vehicle.charge();
    }
  }
}
