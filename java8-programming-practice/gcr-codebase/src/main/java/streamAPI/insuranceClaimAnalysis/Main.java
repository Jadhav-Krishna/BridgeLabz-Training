package streamAPI.insuranceClaimAnalysis;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        List<InsuranceClaim> claims = Arrays.asList(
                new InsuranceClaim("Health", 50000),
                new InsuranceClaim("Vehicle", 30000),
                new InsuranceClaim("Health", 70000),
                new InsuranceClaim("Property", 120000),
                new InsuranceClaim("Vehicle", 45000)
        );

        ClaimService service = new ClaimService();

        Map<String, Double> avgClaims =
                service.getClaim(claims);

        avgClaims.forEach((type, avg) ->
                System.out.println(type + " -> Average Amount: " + avg)
        );
    }
}
