package org.scenario.EduResults;

public class Main {
    public static void main(String[] args) {

        Student[] students = {
            new Student("Harsh", 85),
            new Student("Muskan", 92),
            new Student("Abhijeet", 85),
            new Student("Anuj", 78)
        };

        EduResults er = new EduResults();
        er.mergeSort(students, 0, students.length - 1);

        for (Student s : students) {
            System.out.println(s.name + " - " + s.marks);
        }
    }
}
