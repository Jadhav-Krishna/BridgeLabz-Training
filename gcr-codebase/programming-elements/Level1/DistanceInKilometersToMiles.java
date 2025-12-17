// Initialising the class and the main method
import java.util.*;
class DistanceInKilometersToMiles{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

		// initialising the Variable and calculating the volume of Earth
		double km = input.nextInt();
		double mile = km + (km*0.621371);

		// Displaying the output in the proper format
		System.out.print("The total miles is "+ km +" mile for the given "+ mile +" km");
	}
}