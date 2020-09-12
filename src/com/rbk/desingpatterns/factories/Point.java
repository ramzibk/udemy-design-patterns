package com.rbk.desingpatterns.factories;

public class Point {
  private double x, y;

  // if the constructor is left public, there would be more options
  // to construct a Point other than the ones we want to define
  private Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public String toString() {
    return "Point{" +
        "x=" + x +
        ", y=" + y +
        '}';
  }

  // the class is internal, so that it can access the private Point constructor
  public static class Factory {
    public static Point newCartesianPoint(double x, double y){
      return new Point(x, y);
    }

    public static Point newPolarPoint(double rho, double theta){
      return new Point(rho*Math.cos(theta), rho*Math.sin(theta));
    }
  }
}

