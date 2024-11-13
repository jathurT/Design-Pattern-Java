package com.uor.behavioral.template;

public class Main {
  public static void main(String[] args) {
    System.out.println("Making Tea...");
    TeaMaker teaMaker = new TeaMaker();
    teaMaker.makeBeverage();

    System.out.println("\nMaking Coffee...");
    CoffeeMaker coffeeMaker = new CoffeeMaker();
    coffeeMaker.makeBeverage();
  }
}
