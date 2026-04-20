package controller;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import model.Dog;

public class Controller {
  private Dog dog = new Dog(this);
  private GraphicsContext gc;
  private Canvas canvas;

  public Controller(GraphicsContext _gc, Canvas _canvas) {
    gc = _gc;
    canvas = _canvas;
  }

  public void moveDog(int x, int y) {
    gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
    gc.drawImage(dog.getImage(), dog.getX(), dog.getY());
  }

  public void setActive(double mx, double my) {
    setDirection((int) mx, (int) my);
    dog.setActive(true);
    if (dog.getState() == Thread.State.NEW) {
      dog.start();
    }
    System.out.println(dog.getX());
  }

  public void setInactive() {
    dog.setActive(false);
  }

  public void kill() {
    dog.kill();
  }

  /// Primitive movement system, but I don't really care.
  public void setDirection(int mx, int my) {
    if (mx > dog.getX()) {
      dog.setXSpd(1);
    } else {
      dog.setXSpd(-1);
    }
    if (my > dog.getY()) {
      dog.setYSpd(1);
    } else {
      dog.setYSpd(-1);
    }
  }

}
