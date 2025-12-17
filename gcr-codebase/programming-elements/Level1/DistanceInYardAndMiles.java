// Initialising the class and the main method
import java.util.*;
class DistanceInYardAndMiles{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // initialising the Variable and calculating yard and miles
        int feet = sc.nextInt();
        double yard = feet / 3.0;
        double miles = yard / 1760.0;

        // Displaying the output in the proper format
        System.out.print("The distance in feet is "+ feet +" whose in "+ yard +" yard and "+ miles +" miles");
    }
}