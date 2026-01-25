package generics.multiLevelUniversityCourseManagementSystem;

import java.util.*;

class UniversityUtil {

    public static void displayCourses(List<? extends CourseType> list) {
        for (CourseType ct : list) {
            System.out.println(ct.getTypeName() + " : " + ct.getEvaluationType());
        }
    }
}
