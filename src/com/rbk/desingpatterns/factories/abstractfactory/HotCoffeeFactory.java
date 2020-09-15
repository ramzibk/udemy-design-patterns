package com.rbk.desingpatterns.factories.abstractfactory;

import com.rbk.desingpatterns.factories.abstractfactory.products.Coffee;
import com.rbk.desingpatterns.factories.abstractfactory.products.HotDrink;

class HotCoffeeFactory implements HotDrinkFactory{
  public HotDrink prepare(int amount){
    System.out.println(amount + " of Coffee is beeing prepared");
    return new Coffee();
  }
}
