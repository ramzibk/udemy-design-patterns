package com.rbk.desingpatterns.factories;

public class Demo {

  public static void main(String[] args) {
    Point p1 = new Point(5,2, CoordinteSystem.CARTESIAN);
    System.out.println(p1);
    Point p2 = new Point(10, 45, CoordinteSystem.POLAR);
    System.out.println(p2);
  }
}
