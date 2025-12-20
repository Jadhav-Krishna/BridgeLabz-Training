import java.util.*;

class SimpleIntrest{
	// Logic for finding the Simple Intrest with this methods.
	public static int simpleIntrest(int principal, int rate, int time){
		return (principal * rate * time) / 100;
	}

	// Used to take input and Trigger the method.
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("principal : ");
		int principal = sc.nextInt();
		System.out.print("rate : ");
		int rate = sc.nextInt();
		System.out.print("time : ");
		int time = sc.nextInt();

		simpleIntrest(principal, rate, time);

	 // Displaying the input 
	System.out.print("The Simple Interest is "+ simpleIntrest(principal, rate, time) +" for Principal "+ principal + ", Rate of Interest "+ rate + " and Time "+ time);
	}
}