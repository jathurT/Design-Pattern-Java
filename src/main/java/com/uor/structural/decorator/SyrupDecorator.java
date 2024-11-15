package com.uor.structural.decorator;

public class SyrupDecorator extends CoffeeDecorator {
  public SyrupDecorator(Coffee coffee) {
    super(coffee);
  }

  @Override
  public String getDescription() {
    return decoratedCoffee.getDescription() + ", Syrup";
  }

  @Override
  public Double getCost() {
    return decoratedCoffee.getCost() + 0.5;
  }
}
