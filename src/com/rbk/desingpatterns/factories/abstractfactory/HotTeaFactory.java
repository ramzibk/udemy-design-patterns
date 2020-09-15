package com.rbk.desingpatterns.factories.abstractfactory;

import com.rbk.desingpatterns.factories.abstractfactory.products.HotDrink;
import com.rbk.desingpatterns.factories.abstractfactory.products.Tea;

class HotTeaFactory implements HotDrinkFactory{
  public HotDrink prepare(int amount){
    System.out.println(amount + " of Tea is beeing prepared");
    return new Tea();
  }
}
