package com.rbk.desingpatterns.factories.abstractfactory;

import com.rbk.desingpatterns.factories.abstractfactory.products.HotDrink;

interface HotDrinkFactory {
  HotDrink prepare(int amount);
}
