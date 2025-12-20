// Initialising the class and the main method
import java.util.*;
class TriangularPark{
	public static int perimeter(int triangleSide){
		return (triangleSide + triangleSide + triangleSide);
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // initialising the Variable and calculating perimeter of triangle
        int triangleSide = sc.nextInt();
        // Displaying the output in the proper format
        System.out.print("number of rounds " + (perimeter(triangleSide)/5));
    }
}