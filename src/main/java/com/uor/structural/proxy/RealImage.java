package com.uor.structural.proxy;

// Real Subject
public class RealImage implements Image {
  private String fileName;

  public RealImage(String fileName) {
    this.fileName = fileName;
    loadImageFromDisk(fileName);
  }

  private void loadImageFromDisk(String fileName) {
    System.out.println("Loading " + fileName);
  }

  @Override
  public void display() {
    System.out.println("Displaying " + fileName);
  }
}
