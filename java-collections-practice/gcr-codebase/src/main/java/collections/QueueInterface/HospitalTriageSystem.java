// Simulate a hospital triage system using a PriorityQueue where patients with higher severity are treated first.
//Example:
//Patients: [("John", 3), ("Alice", 5), ("Bob", 2)] → Order: Alice, John, Bob.

package collections.QueueInterface;
import java.util.*;
public class HospitalTriageSystem {
	
	static class Patient {
		String name;
		int severity;

		Patient(String name, int severity) {
			this.name = name;
			this.severity = severity;
		}
	}

	public static void main(String[] args) {
		PriorityQueue<Patient> triageQueue = new PriorityQueue<>(new Comparator<Patient>() {
			@Override
			public int compare(Patient p1, Patient p2) {
				return Integer.compare(p2.severity, p1.severity);
			}
		});

		triageQueue.add(new Patient("Harsh", 3));
		triageQueue.add(new Patient("Yash", 5));
		triageQueue.add(new Patient("Shilpa", 2));

		System.out.println("Order of treatment:");
		while (!triageQueue.isEmpty()) {
			Patient patient = triageQueue.poll();
			System.out.println(patient.name + " (Severity: " + patient.severity + ")");
		}

	}

}
