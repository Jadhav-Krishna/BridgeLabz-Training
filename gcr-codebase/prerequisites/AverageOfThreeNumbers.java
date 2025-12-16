import java.util.*;

class AverageOfThreeNumbers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st num : ");
		double a = sc.nextDouble();
		System.out.print("Enter 2nd num : ");
		double b = sc.nextDouble();
		System.out.print("Enter 3rd num : ");
		double c = sc.nextDouble();
		double avg = (a+b+c)/3;
		System.out.print(avg);
	}
}