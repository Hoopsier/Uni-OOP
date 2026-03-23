package com.mod2.app;

public class CoffeeMachineDriver {
  private CoffeeMachine machine;

  public CoffeeMachineDriver(CoffeeMachine machine) {
    this.machine = machine;
  }

  public void test() {
    if (!machine.isOn()) {
      machine.pressOnOff();
    }
    System.out.println("Machine is on");
    machine.setMode(true);
    pour(50);
    machine.pressOnOff();
    System.out.println("Machine is off");

  }

  public void pour(int qtt) {
    if (!machine.isOn())
      return;
    boolean mode = machine.getMode();
    if (mode) {
      System.out.println("Coffee type is espresso");
    } else {
      System.out.println("Coffee type is normal");
    }
    System.out.println("Coffee amount is " + qtt + " ml");
  }
}
