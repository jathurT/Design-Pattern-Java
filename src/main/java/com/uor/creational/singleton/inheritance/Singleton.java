package com.uor.creational.singleton.inheritance;

public class Singleton {
  private static Singleton instance;

  protected Singleton() {
    System.out.println("Singleton instance created");
  }

  public static Singleton getInstance() {
    if (instance == null) {
      instance = new Singleton();
    }
    return instance;
  }

  public void printMessage() {
    System.out.println("Hello world!");
  }
}

class Main {
  public static void main(String[] args) {
    Singleton singleton1 = Singleton.getInstance();
    singleton1.printMessage();

    SubSingleton singleton2 = SubSingleton.getInstance();
    singleton2.printMessage();
  }
}