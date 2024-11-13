package com.uor.creational.singleton.eagerInitialization;


// the instance of the Singleton class is created at the time of class loading.
// This approach ensures that a single instance of the class is created immediately,
// before any other code accesses it
public class Singleton {
  private static final Singleton instance = new Singleton();

  private Singleton() {
    System.out.println("Singleton instance created");
  }

  public static Singleton getInstance() {
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