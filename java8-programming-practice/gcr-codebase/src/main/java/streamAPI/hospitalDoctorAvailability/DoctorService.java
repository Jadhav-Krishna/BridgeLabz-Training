package streamAPI.hospitalDoctorAvailability;

import java.util.Comparator;
import java.util.List;

public class DoctorService {
	public List<Doctor> sortDoctor(List<Doctor> doctor){
		return doctor.stream().filter(Doctor::isAvailableOnWeekend).sorted(Comparator.comparing(Doctor::getSpecility)).toList();
	}

}
