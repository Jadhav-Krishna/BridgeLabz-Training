package streamAPI.hospitalDoctorAvailability;

public class Doctor {
	private String name;
	private String specility;
	private boolean availableOnWeekend;
	
	Doctor(String name, String specility, boolean availableOnWeekend){
		this.name = name;
		this.specility = specility;
		this.availableOnWeekend = availableOnWeekend;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSpecility() {
		return specility;
	}
	
	public boolean isAvailableOnWeekend() {
		return availableOnWeekend;
	}

	@Override
	public String toString() {
		return name + " | " + specility;
	}

}
