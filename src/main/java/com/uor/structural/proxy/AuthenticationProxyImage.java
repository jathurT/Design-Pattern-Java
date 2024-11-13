package com.uor.structural.proxy;

public class AuthenticationProxyImage implements Image {

  private ProxyImage proxyImage;
  private Boolean isAuthenticated;

  public AuthenticationProxyImage(Boolean isAuthenticated) {
    this.isAuthenticated = isAuthenticated;
  }

  @Override
  public void display() {
      if (isAuthenticated) {
          if (proxyImage == null) {
              proxyImage = new ProxyImage("test.jpg");
          }
          proxyImage.display();
      } else {
          System.out.println("You are not authenticated to view the image");
      }
  }
}
