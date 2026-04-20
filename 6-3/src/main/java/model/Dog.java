package model;

import controller.Controller;
import javafx.scene.image.Image;

public class Dog extends Thread {
  private int x, y;
  private Image dog = new Image("Free-Puppy.jpg");
  private boolean isActive = false;
  private int sx, sy;
  private boolean alive = true;
  private Controller controller;

  public Dog(Controller _controller) {
    controller = _controller;
  }

  public void kill() {
    alive = false;
  }

  public void setPos(int _x, int _y) {
    x = _x;
    y = _y;
  }

  public boolean getActive() {
    return isActive;
  }

  public void setActive(boolean value) {
    isActive = value;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public Image getImage() {
    return dog;
  }

  public void run() {
    while (alive) {
      if (!isActive) {
        try {
          Thread.sleep(300);
        } catch (Exception e) {
          System.err.println("interrupted");
        }
        continue;
      }
      System.out.println("started");
      while (isActive) {
        x += sx;
        y += sy;
        controller.moveDog(x, y);
        try {
          Thread.sleep(50);
        } catch (Exception e) {
          System.err.println(e);
        }
      }
      System.out.println("ended");
    }
  }

  public void setXSpd(int x) {
    sx = x;
  }

  public void setYSpd(int y) {
    sy = y;
  }
}
