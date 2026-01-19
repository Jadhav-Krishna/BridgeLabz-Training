package org.scenario.HomeNest;

abstract class Device {

    private String deviceId;
    private boolean status;
    protected double energyUsage;

    protected String firmwareLog;

    Device(String deviceId, double energyUsage) {
        this.deviceId = deviceId;
        this.energyUsage = energyUsage;
        this.status = false;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public boolean isOn() {
        return status;
    }

    protected void setStatus(boolean status) {
        this.status = status;
    }

    double calculateEnergy(double hours) {
        return energyUsage * hours;
    }
}
