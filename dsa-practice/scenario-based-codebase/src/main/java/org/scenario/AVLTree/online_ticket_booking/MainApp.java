package org.scenario.AVLTree.online_ticket_booking;

import java.util.Scanner;

public class MainApp
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        EventBST events = new EventBST();

        while (true)
        {
            System.out.println("\nOnline Ticket Booking System");
            System.out.println("1. Add Event");
            System.out.println("2. Cancel Event");
            System.out.println("3. Show Upcoming Events");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.print("Enter Event Time (e.g. 1830): ");
                    int eventTime = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Event Name: ");
                    String eventName = scanner.nextLine();

                    events.rootNode = events.addEvent(events.rootNode, eventTime, eventName);
                    System.out.println("Event added successfully");
                    break;

                case 2:
                    System.out.print("Enter Event Time to cancel: ");
                    int cancelTime = scanner.nextInt();
                    events.rootNode = events.removeEvent(events.rootNode, cancelTime);
                    System.out.println("Event cancelled");
                    break;

                case 3:
                    System.out.println("Upcoming Events:");
                    events.printUpcoming(events.rootNode);
                    break;

                case 4:
                    System.out.println("Program ended");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
