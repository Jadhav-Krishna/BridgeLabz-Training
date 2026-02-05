package org.scenario.AVLTree.gaming_app;

import java.util.Scanner;

public class MainApp
{
    public static void main(String[] args)
    {
        AVLLeaderboard leaderboard = new AVLLeaderboard();
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.println("Gaming Leaderboard");
            System.out.println("1. Add / Update Player");
            System.out.println("2. Remove Player");
            System.out.println("3. Show Top 10 Players");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.print("Enter Player ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Player Name: ");
                    String playerName = scanner.nextLine();
                    System.out.print("Enter Score: ");
                    int score = scanner.nextInt();

                    leaderboard.rootNode = leaderboard.addOrUpdate(leaderboard.rootNode, id, playerName, score);
                    System.out.println("Player Added / Updated");
                    break;

                case 2:
                    System.out.print("Enter Player Score to Remove: ");
                    int removeScore = scanner.nextInt();
                    leaderboard.rootNode = leaderboard.removeByScore(leaderboard.rootNode, removeScore);
                    System.out.println("Player Removed");
                    break;

                case 3:
                    System.out.println("\n TOP PLAYERS");
                    leaderboard.printedCount = 0;
                    leaderboard.printTop10(leaderboard.rootNode);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
