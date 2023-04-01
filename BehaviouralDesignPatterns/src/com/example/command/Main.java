package com.example.command;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Command onCommand = new LightOnCommand(light);
        Command offCommand = new LightOffCommand(light);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(onCommand);
        remoteControl.pressButton();

        remoteControl.setCommand(offCommand);
        remoteControl.pressButton();
    }
}