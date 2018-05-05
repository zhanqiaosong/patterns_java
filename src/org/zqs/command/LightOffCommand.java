package org.zqs.command;

public class LightOffCommand extends OffCommand {
    private Light light;
	public LightOffCommand(Light light) {
		this.light = light;
	}
	@Override
	public void execute() {
		light.off();
	}

}
