package com.uor.structural.decorator;

public class MilkDecorator extends CoffeeDecorator {
   public MilkDecorator(Coffee coffee) {
    super(coffee);
  }

  @Override
  public String getDescription() {
    return coffee.getDescription() + ", Milk";
  }

  @Override
  public Double getCost() {
    return coffee.getCost() + 0.5;
  }
}
