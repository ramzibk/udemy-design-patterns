package com.rbk.desingpatterns.factories.abstractfactory.products;


public class Tea implements HotDrink {

  @Override
  public void consume() {
    System.out.println("This tea is delicious");
  }
}

