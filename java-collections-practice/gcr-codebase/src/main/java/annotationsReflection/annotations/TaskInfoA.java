package annotationsReflection.annotations;

public class TaskInfoA {
    @interface TaskInfo {
        String priority();
        String assignedTo();
    }

    public static void main(String[] args) {
        class TaskManager {
            @TaskInfo(priority = "High", assignedTo = "Alice")
            public void completeTask() {
                System.out.println("Task Completed");
            }
        }
        try {
            TaskManager taskManager = new TaskManager();
            TaskInfo taskInfo = taskManager.getClass()
                    .getMethod("completeTask")
                    .getAnnotation(TaskInfo.class);

            if (taskInfo != null) {
                System.out.println("Task Priority: " + taskInfo.priority());
                System.out.println("Assigned To: " + taskInfo.assignedTo());
            }
            taskManager.completeTask();

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
    }
}
}
