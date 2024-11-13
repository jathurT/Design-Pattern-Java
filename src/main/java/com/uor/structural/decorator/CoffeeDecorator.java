package com.uor.structural.decorator;
//  Decorator
public class CoffeeDecorator implements Coffee {
  protected Coffee coffee;

  public CoffeeDecorator(Coffee coffee) {
    this.coffee = coffee;
  }

  @Override
  public String getDescription() {
    return coffee.getDescription();
  }

  @Override
  public Double getCost() {
    return coffee.getCost();
  }
}
