package com.uor.structural.decorator;

public class SyrupDecorator extends CoffeeDecorator {
  public SyrupDecorator(Coffee coffee) {
    super(coffee);
  }

  @Override
  public String getDescription() {
    return coffee.getDescription() + ", Syrup";
  }

  @Override
  public Double getCost() {
    return coffee.getCost() + 0.5;
  }
}
