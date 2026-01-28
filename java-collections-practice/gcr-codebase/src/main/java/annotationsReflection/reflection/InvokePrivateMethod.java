package annotationsReflection.reflection;
import java.lang.reflect.Method;

public class InvokePrivateMethod {
    static class Calculator {
        private int multiply(int a, int b) {
            return a * b;
        }
    }

    public static void main(String[] args) {
        try {
            Calculator calculator = new Calculator();
            Class<?> calculatorClass = calculator.getClass();
            Method multiplyMethod = calculatorClass.getDeclaredMethod("multiply", int.class, int.class);
            multiplyMethod.setAccessible(true);
            int result = (int) multiplyMethod.invoke(calculator, 5, 4);
            System.out.println("Multiplication Result: " + result);
        } catch (Exception e) {
            e.printStackTrace();
}}}
