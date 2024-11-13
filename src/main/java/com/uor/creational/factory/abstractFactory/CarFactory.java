package com.uor.creational.factory.abstractFactory;

//Abstract Factory Interface (CarFactory)
public interface CarFactory {
  Car createCar();

  CarSpecification createSpecification();
}
