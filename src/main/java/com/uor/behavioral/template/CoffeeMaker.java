package com.uor.behavioral.template;

// Concrete Class
public class CoffeeMaker extends BeverageMaker {
  @Override
  public void brew() {
    System.out.println("Dripping Coffee through filter");
  }

  @Override
  public void addCondiments() {
    System.out.println("Adding Sugar and Milk");
  }
}