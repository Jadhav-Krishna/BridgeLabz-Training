// Initialising the class and the main method
import java.util.*;
class MaximumNumberOfHandshakes {
	public static int handShake(int numberOfStudents){
		int totalMaximumHandshake = (numberOfStudents * (numberOfStudents - 1)) / 2;
		return totalMaximumHandshake;
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // initialising the Variable and calculating Maximum Number Of Handshakes
        int numberOfStudents = sc.nextInt();
        
        // Displaying the output in the proper format
        System.out.print("The maximum number of handshakes possible in a group of " + numberOfStudents + " students is " + handShake(numberOfStudents));
    }
}