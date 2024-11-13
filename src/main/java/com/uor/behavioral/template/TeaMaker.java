package com.uor.behavioral.template;

// Concrete Class
public class TeaMaker extends BeverageMaker {
  @Override
  public void brew() {
    System.out.println("Steeping the tea");
  }

  @Override
  public void addCondiments() {
    System.out.println("Adding lemon");
  }
}
