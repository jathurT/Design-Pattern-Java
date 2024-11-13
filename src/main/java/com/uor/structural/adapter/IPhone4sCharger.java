package com.uor.structural.adapter;

//Adaptee class
public class IPhone4sCharger implements Charger {
  public IPhone4sCharger() {
    System.out.println("IPhone 4s charger created");
  }

  @Override
  public void charge() {
    System.out.println("Charging IPhone");
  }
}
