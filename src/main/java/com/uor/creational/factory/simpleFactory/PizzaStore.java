package com.uor.creational.factory.simpleFactory;

public class PizzaStore {
  private final SimplePizzaFactory factory;

  public PizzaStore(SimplePizzaFactory factory) {
    this.factory = factory;
  }

  public Pizza orderPizza(String type) {
    Pizza pizza = factory.createPizza(type);

    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();

    return pizza;
  }
}

class Main {
  public static void main(String[] args) {
    SimplePizzaFactory factory = new SimplePizzaFactory();
    PizzaStore store = new PizzaStore(factory);

    Pizza pizza = store.orderPizza("cheese");
    System.out.println("Ordered a " + pizza.getClass().getSimpleName() + "\n");

    pizza = store.orderPizza("veggie");
    System.out.println("Ordered a " + pizza.getClass().getSimpleName() + "\n");

    pizza = store.orderPizza("clam");
    System.out.println("Ordered a " + pizza.getClass().getSimpleName() + "\n");

    pizza = store.orderPizza("pepperoni");
    System.out.println("Ordered a " + pizza.getClass().getSimpleName() + "\n");
  }
}