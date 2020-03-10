package CommandPattern;

public class DriverCommand {
	public DriverCommand() {
		System.out.println();
		System.out.println("-----Command_Pattern-----");
		RemoteControl control = new RemoteControl();
	    Light light = new Light();
	    Command lightsOn = new LightsOnCmd(light);
	    Command lightsOff = new LightsOffCmd(light);
	    control.setCommand(lightsOn);
	    control.pressButton();
	    control.setCommand(lightsOff);
	    control.pressButton();
	}
}
