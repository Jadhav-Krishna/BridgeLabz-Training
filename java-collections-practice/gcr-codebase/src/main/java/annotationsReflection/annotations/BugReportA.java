package annotationsReflection.annotations;
import java.util.*;
import java.lang.annotation.*;

public class BugReportA {
    @Retention(RetentionPolicy.RUNTIME)
    @Repeatable(BugReports.class)
    public @interface BugReport {
        String description();
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface BugReports {
        BugReport[] value();
    }

    public static void main(String[] args) {
        class SoftwareModule {
            @BugReport(description = "Null pointer exception on login")
            @BugReport(description = "UI misalignment on dashboard")
            public void process() {
                System.out.println("Processing...");
            }
        }

        try {
            SoftwareModule module = new SoftwareModule();
            BugReports bugReports = module.getClass()
                    .getMethod("process")
                    .getAnnotation(BugReports.class);

            if (bugReports != null) {
                for (BugReport bugReport : bugReports.value()) {
                    System.out.println("Bug Description: " + bugReport.description());
                }
            }
            module.process();

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
