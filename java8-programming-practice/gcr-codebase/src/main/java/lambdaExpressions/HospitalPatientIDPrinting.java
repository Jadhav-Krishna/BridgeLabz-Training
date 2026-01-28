package lambdaExpressions;
import java.util.*;

public class HospitalPatientIDPrinting {
    static class Patient {
        String name;
        String patientID;
        int age;

        Patient(String name, String patientID, int age) {
            this.name = name;
            this.patientID = patientID;
            this.age = age;
        }

        public String getPatientID() {
            return patientID;
        }
    }

    public static void main(String[] args) {
        List<Patient> patients = Arrays.asList(
                new Patient("Harsh", "P123", 30),
                new Patient("Shna", "P456", 45),
                new Patient("Muskan", "P789", 25)
        );

        System.out.println("Patient IDs:");
        patients.stream().map(Patient::getPatientID).forEach(System.out::println);
    }
}
