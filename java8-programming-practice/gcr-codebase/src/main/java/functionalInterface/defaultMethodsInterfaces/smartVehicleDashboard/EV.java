package functionalInterface.defaultMethodsInterfaces.smartVehicleDashboard;

public class EV implements Vehicle{

	@Override
	public void displaySpeed() {
		System.out.println("140 km/hr");
	}
	
	public void displayBatteryPercentage() {
		System.out.println("74%");
	}

}
