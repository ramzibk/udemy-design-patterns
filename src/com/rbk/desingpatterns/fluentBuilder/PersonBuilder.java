package com.rbk.desingpatterns.fluentBuilder;

class PersonBuilder<SELF extends PersonBuilder<SELF>> {
  protected Person person = new Person();

  public SELF withName(String name){
    person.name = name;
    // return (SELF) this; // The warning shown by the IDE can be ignored
    // a better solution would be to return the instance through a method self()
    return self(); // using the meethod self() we can override it in subclasses
  }
  public Person build() {
    return person;
  }

  /*
  This is needed to overcome the warning by the IDE
  Also this is a good way to let subclasses override the return value
   */
  protected SELF self() {
    return (SELF) this;
  }
}
