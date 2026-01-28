package annotationsReflection.reflection;
import  java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;


public class MethodExecutionTiming {
    static class SampleOperations {
        public void operationOne() throws InterruptedException {
            Thread.sleep(100);
        }

        public void operationTwo() throws InterruptedException {
            Thread.sleep(200);
        }
    }

    public static void main(String[] args) {
        try {
            SampleOperations operations = new SampleOperations();
            Class<?> opsClass = operations.getClass();

            for (Method method : opsClass.getDeclaredMethods()) {
                long startTime = System.nanoTime();
                method.invoke(operations);
                long endTime = System.nanoTime();
                long duration = endTime - startTime;
                System.out.println("Execution time of " + method.getName() + ": " + duration + " nanoseconds");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
