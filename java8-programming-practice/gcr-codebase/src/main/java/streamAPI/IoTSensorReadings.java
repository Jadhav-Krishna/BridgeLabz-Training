package streamAPI;

import java.util.Arrays;
import java.util.List;

public class IoTSensorReadings {

	public static void main(String[] args) {
		List<Double> sensorReading = Arrays.asList(45.6,57.9,62.8,72.6,48.0,55.2,57.6);
		sensorReading.stream().filter(x -> x > 55).forEach(System.out::print);
	}

}
