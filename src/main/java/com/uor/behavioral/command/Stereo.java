package com.uor.behavioral.command;

// Concrete Receiver for Stereo
public class Stereo implements Device {
  @Override
  public void turnOn() {
    System.out.println("Stereo is on");
  }

  @Override
  public void turnOff() {
    System.out.println("Stereo is off");
  }

  public void adjustVolume() {
    System.out.println("Stereo volume is adjusted");
  }
}
