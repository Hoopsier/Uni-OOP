package com.mod2.app;

import java.awt.Color;

class ShapeCalc {
  Shape[] shapes = { new Triangle(1, 2, 3), new Circle(15, Color.RED), new Rectangle(15, 2, Color.GREEN) };

  public void printAreas() {
    for (Shape shape : shapes) {
      System.out.println("Area of " + shape.getClass() + " colored " + shape.color + ": " + shape.calculateArea());
    }
  }
}
