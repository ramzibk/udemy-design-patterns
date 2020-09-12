package com.rbk.desingpatterns.factories;

enum CoordinteSystem {
  CARTESIAN,
  POLAR
}

public class Point {
  private double x, y;

  public Point(double a, double b, CoordinteSystem cs) {
    switch (cs) {
      case CARTESIAN:
        this.x = x;
        this.y = y;
        break;
      case POLAR:
        this.x = a*Math.cos(b);
        this.y = a*Math.sin(b);
        break;
      default:
    }
  }

  @Override
  public String toString() {
    return "Point{" +
        "x=" + x +
        ", y=" + y +
        '}';
  }
}

