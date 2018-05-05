package org.zqs.command;

public class Main {
    public static void main(String[] args) {
		RemoteControl control = new RemoteControl(7);
		Light light = new Light();
		OnCommand onCommand = new LightOnCommand(light);
		OffCommand offCommand = new LightOffCommand(light);
		control.setCommand(1, onCommand, offCommand);
		control.onButtonWasPushed(1);
		control.onButtonWasPushed(1);
		control.offButtonWasPushed(1);
		control.offButtonWasPushed(1);
	}
}
