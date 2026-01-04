package org.scenario.smartHomeAutomation;

public class Light extends Appliance implements Controllable{
	
	Light(String deviceName){
		super(deviceName,10);
	}
	@Override
	public void turnOn() {
		setPowerStatus(true);
		System.out.println(deviceName + " is turned On");
	}
	@Override
	public void turnOff() {
		setPowerStatus(false);
		System.out.println(deviceName + " is turned off");
	}
}
