package org.command;

public class Main {
  public static void main(String[] args) {
    SimpleRemoteControl remote = new SimpleRemoteControl();
    Light light = new Light();

    LightOnCommand lighOn = new LightOnCommand(light);

    remote.setCommand(lighOn);
    remote.buttonWasPressed();
  }
}
