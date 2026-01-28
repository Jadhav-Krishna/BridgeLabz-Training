package annotationsReflection.annotations;
import java.lang.annotation.*;

public class LogExecutionTimeA {
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    public @interface LogExecutionTime {
    }

    public static class PerformanceTester {
        @LogExecutionTime
        public void fastMethod() {
            for (int i = 0; i < 1000; i++);
        }

        @LogExecutionTime
        public void slowMethod() {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        PerformanceTester tester = new PerformanceTester();
        for (java.lang.reflect.Method method : PerformanceTester.class.getDeclaredMethods()) {
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                long startTime = System.nanoTime();
                try {
                    method.invoke(tester);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                long endTime = System.nanoTime();
                System.out.println("Execution time of " + method.getName() + ": " + (endTime - startTime) + " ns");
            }
        }

}
