package com.rbk.desingpatterns.factories.abstractfactory;

import com.rbk.desingpatterns.factories.abstractfactory.products.HotDrink;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.reflections.Reflections;

public class HotDrinkMachine {
  private List<Map.Entry<String, HotDrinkFactory>> namedFactories = new ArrayList<>();

  public HotDrinkMachine()
      throws Exception {
    Set<Class<? extends HotDrinkFactory>> types = new Reflections("")
        .getSubTypesOf(HotDrinkFactory.class);
    for(Class<? extends HotDrinkFactory> type : types){
      namedFactories.add( new AbstractMap.SimpleEntry<>(
          type.getSimpleName().replace("Factory", ""),
          type.getDeclaredConstructor().newInstance())
      );
    }
  }

  public HotDrink makeDrink() throws Exception {
    System.out.println("Available drinks:");
    for( int index=0; index<namedFactories.size(); index++) {
      Map.Entry<String, HotDrinkFactory> entry = namedFactories.get(index);
      System.out.println(index+" "+ entry.getKey());
    }

    System.out.print("Please select a drink: ");
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String input;
    while(true) {
      input = reader.readLine();
      if( input == null)
        continue;

      if( input.equalsIgnoreCase("-1") || input.equalsIgnoreCase("exit"))
        System.exit(0);

      int kind = Integer.parseInt(input);
      if( kind >= 0 &&
          namedFactories.size() > 0
      ) {
        System.out.println("Please specify the amount: ");

        int amount;
        input = reader.readLine();
        if( input != null &&
            (amount = Integer.parseInt(input)) > 0
        ) {
          return namedFactories.get(kind).getValue().prepare(amount);
        }
      }
      System.out.println("Incorrect Input, try again.");
    }
  }

}
