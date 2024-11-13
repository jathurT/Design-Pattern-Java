package com.uor.creational.factory.simpleFactory;

public class NYCheesePizza extends Pizza {
  public void prepare() {
    System.out.println("Preparing NY cheese pizza");
  }

  public void bake() {
    System.out.println("Baking NY cheese pizza");
  }

  public void cut() {
    System.out.println("Cutting NY cheese pizza");
  }

  public void box() {
    System.out.println("Boxing NY cheese pizza");
  }

  public void deliver() {
    System.out.println("Delivering NY cheese pizza");
  }
}
