package functionalInterface.functionalInterface;

import java.util.function.Function;

public class StringLengthChecker {
	
		public static void main(String[] args) {
		Function<String, Integer> lengthFun = message -> message.length();

		String message1 = "Hello, World!";
		String message2 = "Java Programming";

		int length1 = lengthFun.apply(message1);
		int length2 = lengthFun.apply(message2);

		System.out.println("String 1: " + length1);
		System.out.println("String 2: " + length2);
	}

}
