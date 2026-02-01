package streamAPI.insuranceClaimAnalysis;

public class InsuranceClaim {
	private String insuranceType;
	private double insuranceAmount;
	
	public InsuranceClaim(String insuranceType, double insuranceAmount) {
		this.insuranceType = insuranceType;
		this.insuranceAmount = insuranceAmount;
	}
	
	public String getInsuranceType() {
		return insuranceType;
	}
	public double getInsuranceAmount() {
		return insuranceAmount;
	}


}
