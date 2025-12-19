// Created a class , and 
import java.util.*;
class BMICalculator{

	// Writing the logic to find the BMI.
	// Main method with a scanner object
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Taking input
		System.out.print("Height : ");
		int height = sc.nextInt();
		System.out.print("weight : ");
		double weight = sc.nextDouble();
		double bmi = weight / (height * height);
		if(bmi <= 18.4){
			System.out.print("Underweight");
		}else if(bmi >= 18.5 && bmi <= 24.9){
			System.out.print("Normal");
		}else if(bmi >= 25.0 && bmi <= 39.9){
			System.out.print("Overweight");
		}else if(bmi >= 40.0){
			System.out.print("Obese");
		}else{
			System.out.print("Wrong input");
		}

		// Close the Scanner class
		sc.close();
	}
}