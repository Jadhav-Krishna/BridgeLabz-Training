import java.util.*;

class VolumeOfCylinder{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius : ");
		double radius = sc.nextDouble();
		System.out.print("Enter height : ");
		double height = sc.nextDouble();
		double vol = Math.PI * Math.pow(radius,2) * height;
		System.out.print(vol);
	}
}