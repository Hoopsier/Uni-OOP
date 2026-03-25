package com.mod2.app;

class Bus extends Car {
  private int passengers;

  void passengerEnter(int qtt) {
    passengers += qtt;
  }

  int getPassengers() {
    return passengers;
  }
}
