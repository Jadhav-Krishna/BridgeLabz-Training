// Initialising the class and the main method
import java.util.*;
class SideOfSquare{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // initialising the Variable and calculating the side of square
        int perimeter = sc.nextInt();
        double side = perimeter / 4.0;

        // Displaying the output in the proper format
        System.out.print("The length of the side is "+ side +" whose perimeter is "+ perimeter);
    }
}