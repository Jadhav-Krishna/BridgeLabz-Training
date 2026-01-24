package org.scenario.Tree.BST.UniversityRecordSystem;

public class Main {
    public static void main(String[] args) {
        Node root = null;

        // Insertion
        root = UniversityRecordSystem.insert(root, 50, "Muskan");
        root = UniversityRecordSystem.insert(root, 30, "Harsh");
        root = UniversityRecordSystem.insert(root, 70, "Sachin");
        root = UniversityRecordSystem.insert(root, 20, "Rudra");
        root = UniversityRecordSystem.insert(root, 40, "Karan");
        root = UniversityRecordSystem.insert(root, 60, "Anuj");
        root = UniversityRecordSystem.insert(root, 80, "Kiran");

        System.out.println(" Student Records (Sorted Roll Numbers):");
        UniversityRecordSystem.inorder(root);

        // Search
        System.out.println("\n Searching Roll No 40:");
        Node found = UniversityRecordSystem.search(root, 40);
        if (found != null)
            System.out.println("Found -> Roll: " + found.rollNo + ", Name: " + found.name);
        else
            System.out.println("Student not found");

        // Deletion
        System.out.println("\n Deleting Roll No 30");
        root = UniversityRecordSystem.delete(root, 30);

        System.out.println("\n Updated Student Records:");
        UniversityRecordSystem.inorder(root);
    }
}
