package com.mod2.app;

class ShapeCalc {
  Shape[] shapes = { new Triangle(1, 2, 3), new Circle(15), new Rectangle(15, 2) };

  public void printAreas() {
    for (Shape shape : shapes) {
      System.out.println("Area of " + shape.getClass() + ": " + shape.calculateArea());
    }
  }
}
