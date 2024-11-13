package com.uor.structural.adapter;

//Adapter class
public class Iphone4sTo6sAdapter implements Charger {

  IPhone4sCharger iPhone4sCharger;

  public Iphone4sTo6sAdapter(IPhone4sCharger iPhone4sCharger) {
    this.iPhone4sCharger = iPhone4sCharger;
  }

  @Override
  public void charge() {
    System.out.println("Adapter: Converting IPhone4s charger to IPhone6s charger");
    iPhone4sCharger.charge();
  }
}
