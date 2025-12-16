import java.util.*;

class AreaOfCircle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int radius = sc.nextInt();
		double area = Math.PI * Math.pow(radius,2); 
		System.out.print(area);
	}
}