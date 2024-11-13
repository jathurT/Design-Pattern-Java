package com.uor.creational.factory.abstractFactory;

// Concrete Product for North America Car Specification
public class NorthAmericaSpecification implements CarSpecification {
  @Override
  public void display() {
    System.out.println("North America Specification");
  }
}
