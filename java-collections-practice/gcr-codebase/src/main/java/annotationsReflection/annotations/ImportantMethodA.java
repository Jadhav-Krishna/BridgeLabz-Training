package annotationsReflection.annotations;
import java.lang.annotation.*;
import java.lang.reflect.Method;

public class ImportantMethodA {
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    public @interface ImportantMethod {
        String level() default "HIGH";
    }

    public static class TaskProcessor {
        @ImportantMethod(level = "CRITICAL")
        public void criticalTask() {
            System.out.println("Executing critical task...");
        }

        @ImportantMethod
        public void regularTask() {
            System.out.println("Executing regular task...");
        }

        public void normalTask() {
            System.out.println("Executing normal task...");
        }
    }

    public static void main(String[] args) {
        TaskProcessor processor = new TaskProcessor();
        Method[] methods = TaskProcessor.class.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                System.out.println("Method: " + method.getName() + ", Importance Level: " + annotation.level());
            }
        }
    }
}
