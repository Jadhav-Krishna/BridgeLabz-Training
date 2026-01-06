package org.scenario.CampusConnect;

public class CampusConnectApp {

    public static void main(String[] args) {

        Faculty f1 = new Faculty(1, "Bhuvan", "bhuvan@cap.edu");

        Course java = new Course("Java Programming", f1);

        Student s1 = new Student(101, "Krishna", "krishna@uni.edu", new int[]{8, 9, 10});
        Student s2 = new Student(102, "Muskan", "muskan@uni.edu", new int[]{7, 8, 9});

        s1.enrollCourse(java); 
        s2.enrollCourse(java);

        java.printCourseDetails();
    }
}
