package com.uor.creational.factory.abstractFactory;

public class CarFactoryClient {
  public static void main(String[] args) {
    CarFactory northAmericaCarFactory = new NorthAmericaCarFactory();
    Car northAmericaCar = northAmericaCarFactory.createCar();
    CarSpecification northAmericaCarSpecification = northAmericaCarFactory.createSpecification();

    northAmericaCar.assemble();
    northAmericaCarSpecification.display();


    CarFactory europeCarFactory = new EuropeCarFactory();
    Car europeCar = europeCarFactory.createCar();
    CarSpecification europeCarSpecification = europeCarFactory.createSpecification();

    europeCar.assemble();
    europeCarSpecification.display();
  }
}
