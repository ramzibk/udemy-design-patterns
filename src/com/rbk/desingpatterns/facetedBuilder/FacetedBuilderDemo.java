package com.rbk.desingpatterns.facetedBuilder;

public class FacetedBuilderDemo {

  public static void main(String[] args) {
    PersonBuilder pb = new PersonBuilder();

    Person person = pb.lives()
        .at("somewhere 99")
        .in("Wonderland")
        .withPostcode("888")
        .works()
        .at("Mutafukas")
        .worksAs("Developer")
        .earning(12345)
        .build();
    System.out.printf(person.toString());
  }
}
