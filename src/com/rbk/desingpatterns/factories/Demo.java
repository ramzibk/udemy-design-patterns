package com.rbk.desingpatterns.factories;

import com.rbk.desingpatterns.factories.abstractfactory.HotDrinkMachine;

public class Demo {

  public static void main(String[] args) throws Exception {
    new HotDrinkMachine().makeDrink();
  }
}
