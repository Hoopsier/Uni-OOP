package com.mod2.app;

public class CoffeeMachine {
  private boolean on = false;
  private boolean mode = false; // not expanding, so 1 bit size is fine

  public void pressOnOff() {
    on = !on;
  }

  public boolean isOn() {
    return on;
  }

  /// true is espresso, false is normal
  public void setMode(boolean mode) {
    this.mode = mode;
  }

  public boolean getMode() {
    return mode;
  }
}
