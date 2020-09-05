package com.rbk.desingpatterns.facetedBuilder;

public class Person {

  public String street, streetAddress, postcode, city;
  public String compynaName, position;
  public int annualIncome;

  @Override
  public String toString() {
    return "Person{" +
        "street='" + street + '\'' +
        ", streetAddress='" + streetAddress + '\'' +
        ", postcode='" + postcode + '\'' +
        ", city='" + city + '\'' +
        ", compynaName='" + compynaName + '\'' +
        ", position='" + position + '\'' +
        ", annualIncome=" + annualIncome +
        '}';
  }
}
