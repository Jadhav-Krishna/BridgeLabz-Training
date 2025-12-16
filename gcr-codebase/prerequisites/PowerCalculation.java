import java.util.*;

class PowerCalculation{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st num : ");
		double a = sc.nextDouble();
		System.out.print("Enter 2nd num : ");
		double b = sc.nextDouble();
		double power = Math.pow(a,b);
		System.out.print(power);
	}
}