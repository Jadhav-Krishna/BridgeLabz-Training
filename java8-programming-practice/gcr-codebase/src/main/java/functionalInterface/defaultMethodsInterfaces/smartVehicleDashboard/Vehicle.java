package functionalInterface.defaultMethodsInterfaces.smartVehicleDashboard;

public interface Vehicle {
	void displaySpeed();
	
	default void displayBatteryPercentage() {
		System.out.println("It does't have any battery.");
	}
}
