package org.scenario.smartHomeAutomation;

public class AC extends Appliance implements Controllable{
	
	AC(String deviceName){
		super(deviceName,125);
	}
	
	public void turnOn() {
		setPowerStatus(true);
		System.out.println(deviceName + " is turned On");
	}
	public void turnOff() {
		setPowerStatus(false);
		System.out.println(deviceName + " is turned False");
	}

}
