package com.uor.creational.singleton;

public class Singleton {
  private static Singleton instance;

  private Singleton() {
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

    Singleton singleton2 = Singleton.getInstance();
    singleton2.printMessage();

    System.out.println(singleton1 == singleton2);
  }
}
