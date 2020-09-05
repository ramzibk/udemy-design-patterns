package com.rbk.desingpatterns.fluentBuilder;

public class FluentBuilderDemo {

  public static void main(String[] args) {
    PersonBuilder builder = new PersonBuilder();
    builder.withName("John");
    //builder.worksAt("");
    //does not work because PersonBuilder does not define worksAt()
    //and even if we use EmployeeBuilder instead, withName() still returns a PersonBuilder
    //solution: use Java Recursive Generics

    EmployeeBuilder builder1 = new EmployeeBuilder();
    builder1.withName("Chris")
        .worksAt("NETWAVE");
    Person chris = builder1.build();
    System.out.printf(chris.toString());
  }
}


