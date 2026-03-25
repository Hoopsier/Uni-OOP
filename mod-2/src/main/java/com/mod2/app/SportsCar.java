package com.mod2.app;

class SportsCar extends Car {
  SportsCar(String typeName) {
    super(typeName);
    this.gasLoss = 15;
  }

  @Override
  public void accelerate() {
    if (getGasolineLevel() > 0)
      speed += 20;
    else
      speed = 0;
  }
}
