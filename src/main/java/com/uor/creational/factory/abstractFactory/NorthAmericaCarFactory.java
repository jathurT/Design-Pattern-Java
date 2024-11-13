package com.uor.creational.factory.abstractFactory;

//Concrete Factories
public class NorthAmericaCarFactory implements CarFactory {
  @Override
  public Car createCar() {
    return new Sedan();
  }

  @Override
  public CarSpecification createSpecification() {
    return new NorthAmericaSpecification();
  }
}
