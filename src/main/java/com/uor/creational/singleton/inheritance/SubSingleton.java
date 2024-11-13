package com.uor.creational.singleton.inheritance;

public class SubSingleton extends Singleton {
  private static SubSingleton instance;

  private SubSingleton() {
    System.out.println("SubSingleton instance created");
  }

  public static SubSingleton getInstance() {
    if (instance == null) {
      instance = new SubSingleton();
    }
    return instance;
  }

  @Override
  public void printMessage() {
    System.out.println("Hello world from SubClass!");
  }
}
