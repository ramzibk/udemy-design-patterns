package com.rbk.desingpatterns.facetedBuilder;

public class PersonJobBorder extends PersonBuilder {

  public PersonJobBorder(Person person) {
    this.person = person;
  }

  public PersonJobBorder at(String company){
    person.compynaName = company;
    return this;
  }

  public PersonJobBorder worksAs(String position) {
    person.position = position;
    return this;
  }

  public PersonJobBorder earning(int annualIncome) {
    person.annualIncome = annualIncome;
    return this;
  }

}
