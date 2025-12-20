import java.util.*;

// Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights.
// taking input from the user
public class YoungestFriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input ages and heights
        for (int i = 0; i < friends.length; i++) {
            System.out.print("age " + friends[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter " + friends[i] + ": ");
            heights[i] = sc.nextDouble();
        }
        // Find youngest friend
        int youngestIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }
        // Find tallest friend
        int tallestIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Display results
        System.out.println("youngest : " + friends[youngestIndex] + " age " + ages[youngestIndex]);
        System.out.println("tallest : " + friends[tallestIndex] + " height " + heights[tallestIndex]);

        sc.close();
    }
}
