package annotationsReflection.reflection;

public class DynamicMethodInvocation {
    static class MathOperations {
        public int add(int a, int b) {
            return a + b;
        }

        public int subtract(int a, int b) {
            return a - b;
        }

        public int multiply(int a, int b) {
            return a * b;
        }
    }

    public static void main(String[] args) {
        try {
            MathOperations mathOps = new MathOperations();
            Class<?> mathClass = mathOps.getClass();

            String methodName = "multiply";
            int a = 6;
            int b = 3;

            java.lang.reflect.Method method = mathClass.getMethod(methodName, int.class, int.class);
            int result = (int) method.invoke(mathOps, a, b);

            System.out.println("Result of " + methodName + "(" + a + ", " + b + ") = " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
