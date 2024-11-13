package com.uor.behavioral.command;

public class Client {
  public static void main(String[] args) {
    TV tv = new TV();
    Stereo stereo = new Stereo();
    Command tvOn = new TurnOnCommand(tv);
    Command stereoOn = new TurnOnCommand(stereo);
    Command tvOff = new TurnOffCommand(tv);
    Command adjustVolumeCommand = new AdjustVolumeCommand(stereo);
    Command changeChannelCommand = new ChangeChannelCommand(tv);

    RemoteControl remoteControl = new RemoteControl();

    remoteControl.setCommand(tvOn);
    remoteControl.pressButton();

    remoteControl.setCommand(stereoOn);
    remoteControl.pressButton();

    remoteControl.setCommand(adjustVolumeCommand);
    remoteControl.pressButton();

    remoteControl.setCommand(changeChannelCommand);
    remoteControl.pressButton();

    remoteControl.setCommand(tvOff);
    remoteControl.pressButton();

  }
}
