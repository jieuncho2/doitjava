package chapter10;

public class RemoteControlEx {

	public static void main(String[] args) {
		RemoteControl rc = null;
		
		rc = new Television();
		rc.turnOn();
		rc.serMute(true);
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.serMute(true);
		rc.turnOff();
		
		RemoteControl.changeBattery();
	}

}
