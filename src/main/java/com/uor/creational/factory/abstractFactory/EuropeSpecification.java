package com.uor.creational.factory.abstractFactory;
// Concrete Product
public class EuropeSpecification implements CarSpecification {
  @Override
  public void display() {
    System.out.println("This is a European car");
  }
}
