package com.uor.structural.decorator;

public class Main {
  public static void main(String[] args) {
    Coffee coffee = new PlainCoffee();
    System.out.println("Cost: " + coffee.getCost() + "; Description: " + coffee.getDescription());

    Coffee milkCoffee = new MilkDecorator(coffee);
    System.out.println("Cost: " + milkCoffee.getCost() + "; Description: " + milkCoffee.getDescription());

    Coffee sugarCoffee = new SugarDecorator(milkCoffee);
    System.out.println("Cost: " + sugarCoffee.getCost() + "; Description: " + sugarCoffee.getDescription());

    Coffee milkSugarCoffee = new MilkDecorator(sugarCoffee);
    System.out.println("Cost: " + milkSugarCoffee.getCost() + "; Description: " + milkSugarCoffee.getDescription());

    Coffee sugarMilkSyrupCoffee = new SyrupDecorator(milkSugarCoffee);
    System.out.println("Cost: " + sugarMilkSyrupCoffee.getCost() + "; Description: " + sugarMilkSyrupCoffee.getDescription());
  }
}
