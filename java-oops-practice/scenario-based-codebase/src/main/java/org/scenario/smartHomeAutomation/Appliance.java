package org.scenario.smartHomeAutomation;

public abstract class Appliance {
	protected String deviceName;
	private boolean powerStatus;
	private int powerConsuption;
	
	Appliance(String deviceName, int powerConsuption){
		this.deviceName = deviceName;
		this.powerConsuption = powerConsuption;
		powerStatus = false;
	}
	
	public void setPowerStatus(boolean powerStatus) {
		this.powerStatus = powerStatus;
	}
	
	public boolean isOn() {
		return powerStatus;
	}
	
	public int getPowerConsuption() {
		return powerConsuption;
	}

}
