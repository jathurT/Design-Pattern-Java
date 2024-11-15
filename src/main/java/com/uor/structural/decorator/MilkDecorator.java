package com.uor.structural.decorator;

public class MilkDecorator extends CoffeeDecorator {
   public MilkDecorator(Coffee coffee) {
    super(coffee);
  }

  @Override
  public String getDescription() {
    return decoratedCoffee.getDescription() + ", Milk";
  }

  @Override
  public Double getCost() {
    return decoratedCoffee.getCost() + 0.5;
  }
}
