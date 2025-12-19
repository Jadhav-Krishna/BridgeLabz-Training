// Created a class , and 
import java.util.*;
class PercentageCalculator{

	// Writing the logic to calculate the 3 subject grade.
	// Main method with a scanner object
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Taking input
		System.out.print("Physics : ");
		int physics = sc.nextInt();
		System.out.print("Chemistry : ");
		int chemistry = sc.nextInt();
		System.out.print("Maths : ");
		int maths = sc.nextInt();
		
		int grade = (physics + chemistry + maths)/3;
		if(grade >= 80 &&  grade <=100){
			System.out.print(grade + " Level 4 , above agency-normalized standards");
		}else if(grade >= 70 &&  grade <= 79){
			System.out.print(grade + " Level 3 , at agency-normalized standards");
		}else if(grade >= 60 &&  grade <= 69){
			System.out.print(grade + " Level 2 , below , but approching agency-normalized standards");
		}else if(grade >= 50 &&  grade <= 59){
			System.out.print(grade + " Level 1 , well below agency-normalized standards");
		}else if(grade >= 40 &&  grade <= 49){
			System.out.print(grade + " Level 1 , too below agency-normalized standards");
		}if(grade >= 0 &&  grade <= 39){
			System.out.print(grade + " Remedial Standards");
		}else{
			System.out.print(grade + " Enter correct marks");
		}
		
		// Close the Scanner class
		sc.close();
	}
}