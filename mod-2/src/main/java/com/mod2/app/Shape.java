package com.mod2.app;

import java.awt.Color;

class Shape {
  public double calculateArea() {
    return 0;
  };

  Color color = Color.BLACK;
}

class Triangle extends Shape {
  int h, base, c;

  Triangle(int h, int base, int c, Color color) {
    this.h = h;
    this.base = base;
    this.c = c;
    this.color = color;
  }

  Triangle(int h, int base, int c) {
    this.h = h;
    this.base = base;
    this.c = c;
  }

  @Override
  public double calculateArea() {
    return h * base / 2;
  }
}

class Rectangle extends Shape {
  int h, w;

  Rectangle(int h, int w) {
    this.h = h;
    this.w = w;
  }

  Rectangle(int h, int w, Color color) {
    this.color = color;
    this.h = h;
    this.w = w;
  }

  @Override
  public double calculateArea() {
    return h * w;
  }
}

class Circle extends Shape {
  double radius;

  Circle(double rad) {
    radius = rad;
  }

  Circle(double rad, Color color) {
    radius = rad;
    this.color = color;
  }

  @Override
  public double calculateArea() {
    return Math.PI * 2 * radius;
  }
}
