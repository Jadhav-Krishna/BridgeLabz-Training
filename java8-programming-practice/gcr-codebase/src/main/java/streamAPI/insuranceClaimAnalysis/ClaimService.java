package streamAPI.insuranceClaimAnalysis;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ClaimService {
	
	public Map<String,Double> getClaim(List<InsuranceClaim> claim){
		return claim.stream().collect(Collectors.groupingBy(InsuranceClaim::getInsuranceType,Collectors.averagingDouble(InsuranceClaim::getInsuranceAmount)));
	}

}
