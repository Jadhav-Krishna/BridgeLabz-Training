package streamAPI.hospitalDoctorAvailability;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Doctor> doctors = Arrays.asList(
                new Doctor("Dr. Sharma", "Cardiology", true),
                new Doctor("Dr. Mehta", "Neurology", false),
                new Doctor("Dr. Khan", "Orthopedics", true),
                new Doctor("Dr. Patel", "Dermatology", true),
                new Doctor("Dr. Singh", "Cardiology", false)
        );

        DoctorService service = new DoctorService();

        service.sortDoctor(doctors).forEach(System.out::println);
    }
}
