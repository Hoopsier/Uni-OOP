package com.mod2.app;

public class Television {
  private int channel;
  private boolean on = false;

  public int getChannel() {
    return channel;
  }

  public void setChannel(int ch) {
    channel = ch;
  }

  public boolean isOn() {
    return on;
  }

  public void pressOnOff() {
    on = !on;
  }
}
