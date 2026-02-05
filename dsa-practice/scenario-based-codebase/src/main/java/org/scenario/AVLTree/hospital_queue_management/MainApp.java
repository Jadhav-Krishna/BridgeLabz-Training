package org.scenario.AVLTree.hospital_queue_management;

import java.util.Scanner;

public class MainApp
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        HospitalAVL hospital = new HospitalAVL();

        while (true)
        {
            System.out.println("\nHospital Queue System");
            System.out.println("1. Register Patient");
            System.out.println("2. Discharge Patient");
            System.out.println("3. Display by Arrival Time");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.print("Enter Check-in Time: ");
                    int checkInTime = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Patient Name: ");
                    String patientName = scanner.nextLine();
                    hospital.rootNode = hospital.addPatient(hospital.rootNode, checkInTime, patientName);
                    System.out.println("Patient registered");
                    break;

                case 2:
                    System.out.print("Enter Check-in Time to remove: ");
                    int removeTime = scanner.nextInt();
                    hospital.rootNode = hospital.removeByTime(hospital.rootNode, removeTime);
                    System.out.println("Patient removed");
                    break;

                case 3:
                    System.out.println("Patients by arrival time:");
                    hospital.printByTime(hospital.rootNode);
                    break;

                case 4:
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
