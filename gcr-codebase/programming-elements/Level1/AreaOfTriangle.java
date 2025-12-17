// Initialising the class and the main method
import java.util.*;
class AreaOfTriangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // initialising the Variable and calculating the volume of Earth
        int base = sc.nextInt();
        int height = sc.nextInt();
        double area = 1/2 * base * height;

        // Displaying the output in the proper format
        System.out.print("Height of triangle is "+ height +" while base is "+ base +" and area is "+ area);
    }
}