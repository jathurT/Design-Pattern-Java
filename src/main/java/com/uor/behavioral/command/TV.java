package com.uor.behavioral.command;

// Concrete Receiver for TV
public class TV implements Device {
  @Override
  public void turnOn() {
    System.out.println("TV is turned on");
  }

  @Override
  public void turnOff() {
    System.out.println("TV is turned off");
  }

  public void changeChannel() {
    System.out.println("TV channel is changed");
  }
}
