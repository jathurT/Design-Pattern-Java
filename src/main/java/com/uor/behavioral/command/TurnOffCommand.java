package com.uor.behavioral.command;

// Concrete Command for turning off the device
public class TurnOffCommand implements Command {
  Device device;

  public TurnOffCommand(Device device) {
    this.device = device;
  }

  @Override
  public void execute() {
    device.turnOff();
  }
}
