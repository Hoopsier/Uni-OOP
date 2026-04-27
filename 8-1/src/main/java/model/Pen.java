package model;

public class Pen {
  public enum Color {
    RED("red"), GREEN("green"), BLUE("blue");

    private final String color;

    Color(String color) {
      this.color = color;
    };

    @Override
    public String toString() {
      return color;
    }
  }

  private boolean cap = true;
  private Color color;

  public Pen() {
    color = Color.RED;
  }

  public Pen(Color _color) {
    color = _color;
  }

  // your code here
  public String draw() {
    if (cap == true) {
      return "";
    }
    switch (color) {
      case RED:
        return "Drawing red";
      case BLUE:
        return "Drawing blue";
      case GREEN:
        return "Drawing green";
    }
    return "";
  }

  public void capOn() {
    cap = true;
  }

  public void capOff() {
    cap = false;
  }

  public void changeColor(Color _color) {
    if (!cap)
      return;
    color = _color;
  }
}
