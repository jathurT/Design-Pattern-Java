package com.uor.creational.factory.abstractFactory;

// Concrete Products
public class Sedan implements Car {
  @Override
  public void assemble() {
    System.out.println("Assembling sedan car");
  }
}
