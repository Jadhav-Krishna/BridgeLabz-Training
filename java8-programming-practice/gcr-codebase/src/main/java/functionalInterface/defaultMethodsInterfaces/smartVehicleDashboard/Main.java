package functionalInterface.defaultMethodsInterfaces.smartVehicleDashboard;

public class Main {

	public static void main(String[] args) {
		Vehicle v = new Petrol();
		v.displayBatteryPercentage();

		Petrol p = new Petrol();
		p.displaySpeed();
		p.displayBatteryPercentage();
		
		EV ev = new EV();
		ev.displaySpeed();
		ev.displayBatteryPercentage();
	}

}
