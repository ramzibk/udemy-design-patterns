package com.rbk.desingpatterns.factories;

public class Demo {

  public static void main(String[] args) {
    Point p1 = Point.Factory.newCartesianPoint(10,35);
    System.out.println(p1);
    Point p2 = Point.Factory.newPolarPoint(10, 45);
    System.out.println(p2);
  }
}
