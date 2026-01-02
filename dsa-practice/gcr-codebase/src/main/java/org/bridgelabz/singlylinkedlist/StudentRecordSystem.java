package org.bridgelabz.singlylinkedlist;

public class StudentRecordSystem {
    public static <StudentLinkedList> void main(String[] args) {
        StudentLinkedList list = new StudentLinkedList();

        list.addAtBeginning(1, "Rahul", 20, 'A');
        list.addAtEnd(2, "Amit", 21, 'B');
        list.addAtPosition(2, 3, "Sneha", 19, 'A');

        list.display();

        list.search(2);
        list.updateGrade(2, 'A');

        list.deleteByRollNo(1);

        System.out.println("After Deletion:");
        list.display();
    }
}