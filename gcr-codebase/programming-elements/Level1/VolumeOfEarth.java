// Initialising the class and the main method
import java.util.*;
class VolumeOfEarth{
	public static void main(String[] args){

		// initialising the Variable and calculating the volume of Earth
		int radius = 6378;
		double volume = (4/3) * Math.PI * (radius*radius*radius);
		double mile = volume + (volume*0.621371);

		// Displaying the output in the proper format
		System.out.print("The volume of earth in cubic kilometers is "+ volume +" and cubic miles is "+ mile);
	}
}