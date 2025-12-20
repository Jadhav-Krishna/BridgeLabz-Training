// Initialising the class and the main method
import java.util.*;
class ChocolatesDistribution {

	public static int[] findRemainderAndQuotient(int numberOfchocolates,int numberOfChildren){
		int array[] = new int[2];
		array[0] =  (Integer)numberOfchocolates / numberOfChildren;
        	array[1] = (Integer)numberOfchocolates % numberOfChildren;
		return array;
	}

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // initialising the Variable and calculating the Quotient And Reminder
        int numberOfchocolates = sc.nextInt();
        int numberOfChildren = sc.nextInt();


        // Displaying the output in the proper format
        System.out.print(Arrays.toString(findRemainderAndQuotient(numberOfchocolates,numberOfChildren)));
    }
}