package generics.AIDrivenResumeScreeningSystem;

import java.util.*;

class ScreeningPipeline {

    public static void processPipeline(List<? extends JobRole> roles) {
        System.out.println("\n Screening Pipeline Roles ");
        for(JobRole role : roles){
            System.out.println(role.getRoleName() + " : " + role.getSkillSet());
        }
    }
}
