package com.uor.behavioral.template;

// Abstract Class
abstract public class BeverageMaker {
  public void makeBeverage() {
    boilWater();
    brew();
    pourInCup();
    addCondiments();
  }

  public void boilWater() {
    System.out.println("Boiling water");
  }

  public void pourInCup() {
    System.out.println("Pouring in cup");
  }

  abstract public void brew();

  abstract public void addCondiments();
}
