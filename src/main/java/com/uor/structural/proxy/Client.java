package com.uor.structural.proxy;

public class Client {
  public static void main(String[] args) {
    Image image = new AuthenticationProxyImage(true);
    // Image will be loaded from disk (RealImage object will be created)
    image.display();
    System.out.println();

    // Image will not be loaded from disk (RealImage object will not be created) as it is already loaded in the previous step
    image.display();
  }
}
