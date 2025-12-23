// Created a class 
import java.util.*;
public class StudentCanVote{

	// Writing the logic to check the multiple student can vote or not .
	// Main method with a scanner object
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Taking input
		int noStudent = sc.nextInt();
		printArray(canStudentVote(ageGenerator(noStudent)));
		// Close the Scanner class
		sc.close();
	}
	public static int[] ageGenerator(int n){
		int[] array = new int[n];
		for(int i = 0; i< n ; i++){
			array[i] = (int)Math.floor((Math.random() * 100) + 1);
		}
		return array;
	}
	public static int[][] canStudentVote(int[] array){
		int n = array.length;
		int j = 0;
		int[][] arrayMul = new int[n][2];
		for(int i = 0; i < n ; i++){
			arrayMul[i][0] = array[i];
			if(array[i] >= 18){
				arrayMul[i][1] = 1;
			} else{
				arrayMul[i][1] = 0;
			}
		}
		return arrayMul;
	}
	public static void printArray(int[][] array){
		System.out.print(Arrays.deepToString(array));
		return;
	}
}