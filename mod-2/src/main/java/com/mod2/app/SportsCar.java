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

  @Override
  public void decelerate() {
    if (getGasolineLevel() > 0) {
      if (20 > 0)
        speed = Math.max(0, speed - 20);
    } else
      speed = 0;
  }
}
