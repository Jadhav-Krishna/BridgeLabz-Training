package annotationsReflection.annotations;
import java.lang.annotation.*;
import java.lang.reflect.Method;

public class TodoA {
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    public @interface Todo {
        String task();
        String assignedTo();
        String priority() default "MEDIUM";
    }

    public static class Project {
        @Todo(task = "Implement login feature", assignedTo = "John", priority = "HIGH")
        public void loginFeature() {
            // Implementation pending
        }

        @Todo(task = "Add user profile page", assignedTo = "Jane")
        public void userProfilePage() {
            // Implementation pending
        }

        @Todo(task = "Optimize database queries", assignedTo = "Mike", priority = "LOW")
        public void optimizeQueries() {
            // Implementation pending
        }
    }

    public static void main(String[] args) {
        Project project = new Project();
        Method[] methods = Project.class.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(Todo.class)) {
                Todo todo = method.getAnnotation(Todo.class);
                System.out.println("Task: " + todo.task());
                System.out.println("Assigned To: " + todo.assignedTo());
                System.out.println("Priority: " + todo.priority());
                System.out.println();
            }
        }
    }

}
