package com.uor.creational.singleton.doubleCheckedLocking;

public class Singleton {
//  Why volatile -> To ensure visibility of changes across threads
  private volatile static Singleton instance;

  private Singleton() {
    System.out.println("Singleton instance created");
  }

  public static Singleton getInstance() {
//   This allows the method to return the existing instance without needing to enter the synchronized block each time
    if (instance == null) {
      synchronized (Singleton.class) {
//    Without this second check, multiple threads could create multiple instances of Singleton after entering the synchronized block.
        if (instance == null) {
          instance = new Singleton();
        }
      }
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
  }
}
