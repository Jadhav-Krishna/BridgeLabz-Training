package functionalInterface.implementingInterfaces.MultiVehicleRentalSystem;

public class Car implements Vehicle{
	@Override
	public void rent() {
		System.out.println("Car rented");
	}
	
	@Override
	public void returnVehicle() {
		System.out.println("Car returned");
	}
}
