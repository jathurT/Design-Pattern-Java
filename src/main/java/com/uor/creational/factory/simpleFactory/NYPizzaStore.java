package com.uor.creational.factory.simpleFactory;

public class NYPizzaStore extends PizzaStore {

  private final NYPizzaFactory factory;

  public NYPizzaStore() {
    super(new SimplePizzaFactory());
    factory = new NYPizzaFactory();
  }

  public Pizza createPizza(String type) {
    Pizza pizza = factory.createPizza(type);
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
  }
}

class Main1 {
  public static void main(String[] args) {
    NYPizzaStore store = new NYPizzaStore();

    Pizza pizza = store.createPizza("cheese");
    System.out.println("Ordered a " + pizza.getClass().getSimpleName() + "\n");

    pizza = store.createPizza("veggie");
    System.out.println("Ordered a " + pizza.getClass().getSimpleName() + "\n");

    pizza = store.createPizza("clam");
    System.out.println("Ordered a " + pizza.getClass().getSimpleName() + "\n");

    pizza = store.createPizza("pepperoni");
    System.out.println("Ordered a " + pizza.getClass().getSimpleName() + "\n");
  }
}