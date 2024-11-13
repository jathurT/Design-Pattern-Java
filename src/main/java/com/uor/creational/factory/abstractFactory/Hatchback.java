package com.uor.creational.factory.abstractFactory;

// Concrete Products
public class Hatchback implements Car {
  @Override
  public void assemble() {
    System.out.println("Assembling Hatchback");
  }
}
