package regexJUnit.JUnit;

public class Calculator {
	public int add(int a, int b) {
		return a + b;
	}
	public int subtract(int a, int b) {
		return a - b;
	}
	public int multiply(int a, int b) {
		return a * b;
	}
	public int divide(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException("Division by zero is not allowed.");
		}
		return a / b;
	}

//	public static void main(String[] args) {
//		Calculator calc = new Calculator();
//		System.out.println("Addition: " + calc.add(5, 3));
//		System.out.println("Subtraction: " + calc.subtract(5, 3));
//		System.out.println("Multiplication: " + calc.multiply(5, 3));
//		try {
//			System.out.println("Division: " + calc.divide(5, 0));
//		} catch (ArithmeticException e) {
//			System.out.println("Caught an exception: " + e.getMessage());
//		}
//	}
}
