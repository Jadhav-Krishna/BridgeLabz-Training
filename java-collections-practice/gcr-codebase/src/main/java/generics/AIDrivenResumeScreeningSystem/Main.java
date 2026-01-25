package generics.AIDrivenResumeScreeningSystem;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Resume<SoftwareEngineer> r1 =
            new Resume<>("Krishna", 3, new SoftwareEngineer());

        Resume<DataScientist> r2 =
            new Resume<>("Shna", 1, new DataScientist());

        Resume<ProductManager> r3 =
            new Resume<>("Riya", 4, new ProductManager());

        ScreeningService.screenResume(r1);
        ScreeningService.screenResume(r2);
        ScreeningService.screenResume(r3);

        List<JobRole> roles = new ArrayList<>();
        roles.add(new SoftwareEngineer());
        roles.add(new DataScientist());
        roles.add(new ProductManager());

        ScreeningPipeline.processPipeline(roles);
    }
}

