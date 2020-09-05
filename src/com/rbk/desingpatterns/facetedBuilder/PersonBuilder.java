package com.rbk.desingpatterns.facetedBuilder;

public class PersonBuilder {

  protected Person person = new Person();

  public PersonAddressBuilder lives() {
    return new PersonAddressBuilder(person);
  }

  public PersonJobBorder works() {
    return new PersonJobBorder(person);
  }

  public Person build() {
    return person;
  }
}
