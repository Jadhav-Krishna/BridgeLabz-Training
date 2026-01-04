package org.scenario.smartHomeAutomation;

public class Fan extends Appliance implements Controllable{

	Fan(String deviceName){
		super(deviceName,50);
	}
	
	public void turnOn() {
		setPowerStatus(true);
		System.err.println(deviceName + " is Running");
	}
	public void turnOff() {
		setPowerStatus(false);
		System.out.println(deviceName + " is turned Off");
	}
}
