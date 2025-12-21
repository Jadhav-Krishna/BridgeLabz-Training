import java.util.*;
// program to find the youngest friends among 3 Amar, Akbar and Anthony based on their ages and tallest among the friends based on their heights and display it
public class YoungestFriends {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        for (int i = 0; i < friends.length; i++) {
            System.out.print("age " + friends[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("height " + friends[i] + " : ");
            heights[i] = sc.nextDouble();
        }
        System.out.println("youngest : " + findYoungestFriend(friends, ages));
        System.out.println("tallest : " + findTallestFriend(friends, heights));
    }
    // method to find the youngest friend
    public static String findYoungestFriend(String[] friends, int[] ages) {
        int minAgeIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minAgeIndex]) {
                minAgeIndex = i;
            }
        }
        return friends[minAgeIndex];
    }
    // method to find the tallest friend
    public static String findTallestFriend(String[] friends, double[] heights) {
        int maxHeightIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxHeightIndex]) {
                maxHeightIndex = i;
            }
        }
        return friends[maxHeightIndex];
    }
}
