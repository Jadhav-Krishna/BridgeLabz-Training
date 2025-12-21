// Initialising the class and the main method
import java.util.*;
class WindChillTemperature {

	public static double calculateWindChill(double temperature,double windSpeed){
		return 35.74 + 0.6215 *temperature + (0.4275*temperature - 35.75) * windSpeed; 
	}

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // initialising the Variable and calculating the Quotient And Reminder
        int temperature = sc.nextInt();
        int windSpeed = sc.nextInt();


        // Displaying the output in the proper formate
        System.out.print(calculateWindChill(temperature,windSpeed));
    }
}