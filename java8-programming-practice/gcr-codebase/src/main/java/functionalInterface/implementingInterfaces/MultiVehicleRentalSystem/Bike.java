package functionalInterface.implementingInterfaces.MultiVehicleRentalSystem;

public class Bike implements Vehicle{
	@Override
	public void rent() {
		System.out.println("Bike rented");
	}
	
	@Override
	public void returnVehicle() {
		System.out.println("Return Bike");
	}

}
