package streamAPI;

import java.util.Arrays;
import java.util.List;

public class EventAttendeeWelcomeMessage {

	public static void main(String[] args) {
		List<String> attendee = Arrays.asList("Karan","Muskan","Abhijeet","Harsh","Anuj");
		attendee.forEach(att -> System.out.println("Welcome "+att));
	}

}
