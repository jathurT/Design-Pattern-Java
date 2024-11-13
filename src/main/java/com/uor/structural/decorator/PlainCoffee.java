package com.uor.structural.decorator;

// ConcreteComponent
public class PlainCoffee implements Coffee {
  @Override
  public String getDescription() {
    return "Plain Coffee";
  }

  @Override
  public Double getCost() {
    return 2.0;
  }
}
