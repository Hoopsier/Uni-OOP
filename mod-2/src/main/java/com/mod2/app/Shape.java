package com.mod2.app;

interface Shape {
  public double calculateArea();
}

class Triangle implements Shape {
  int h, base, c;

  Triangle(int h, int base, int c) {
    this.h = h;
    this.base = base;
    this.c = c;
  }

  public double calculateArea() {
    return h * base / 2;
  }
}

class Rectangle implements Shape {
  int h, w;

  Rectangle(int h, int w) {
    this.h = h;
    this.w = w;
  }

  public double calculateArea() {
    return h * w;
  }
}

class Circle implements Shape {
  double radius;

  Circle(double rad) {
    radius = rad;
  }

  public double calculateArea() {
    return Math.PI * 2 * radius;
  }
}
