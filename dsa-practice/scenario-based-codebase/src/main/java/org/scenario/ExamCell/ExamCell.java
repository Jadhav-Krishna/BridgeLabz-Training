package org.scenario.ExamCell;

public class ExamCell {
	public static void main(String[] args) {

        Student[] students = {
            new Student("Rahul", 89),
            new Student("Muskan", 91),
            new Student("harsh", 87),
            new Student("Abhijeet", 77)
        };

        mergeSort(students, 0, students.length - 1);
        for (Student s : students) {
            System.out.println(s.name + " -> " + s.marks);
        }
    }

    static void mergeSort(Student[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    static void merge(Student[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        Student[] L = new Student[n1];
        Student[] R = new Student[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i].marks <= R[j].marks) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }
}
