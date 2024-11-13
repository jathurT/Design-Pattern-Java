package com.uor.creational.factory.simpleFactory;

public class ClamPizza extends Pizza {
  public void prepare() {
    System.out.println("Preparing clam pizza");
  }

  public void bake() {
    System.out.println("Baking clam pizza");
  }

  public void cut() {
    System.out.println("Cutting clam pizza");
  }

  public void box() {
    System.out.println("Boxing clam pizza");
  }
}
