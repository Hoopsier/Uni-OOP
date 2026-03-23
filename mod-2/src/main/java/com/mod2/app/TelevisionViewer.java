package com.mod2.app;

public class TelevisionViewer {
  Television myTV = new Television();

  public void Start() {
    myTV.setChannel(1);

    for (int day = 1; day <= 10; day++) {
      System.out.println("Woke up, day " + day);

      boolean tired = false;

      if (!myTV.isOn())
        myTV.pressOnOff();

      while (!tired) {
        System.out.println("Watching channel " + myTV.getChannel());
        myTV.setChannel(myTV.getChannel() + 1);
        if (myTV.getChannel() % 4 == 0)
          tired = true;
        if (myTV.getChannel() > 10) {
          myTV.setChannel(1);
        }
      }

      myTV.pressOnOff();

      System.out.println("Falling asleep");
    }
  }
}
