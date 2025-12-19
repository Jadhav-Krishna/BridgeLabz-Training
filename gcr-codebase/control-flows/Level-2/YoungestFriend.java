import java.util.*;

// Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights.
public class YoungestFriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//      Taking the input for age and height.
        System.out.print("Amar age: ");
        int ageAmar = sc.nextInt();
        System.out.print("Amar height: ");
        int heightAmar = sc.nextInt();

        System.out.print("Akbar age: ");
        int ageAkbar = sc.nextInt();
        System.out.print("Akbar height: ");
        int heightAkbar = sc.nextInt();

        System.out.print("Anthony age: ");
        int ageAnthony = sc.nextInt();
        System.out.print("Anthony height: ");
        int heightAnthony = sc.nextInt();

        // Youngest friend logic
        if (ageAmar < ageAkbar && ageAmar < ageAnthony) {
            System.out.println("youngest friend is Amar : " + ageAmar);
        } else if (ageAkbar < ageAmar && ageAkbar < ageAnthony) {
            System.out.println("youngest friend is Akbar : " + ageAkbar);
        } else {
            System.out.println("youngest friend is Anthony : " + ageAnthony);
        }

        // Finding the tallest friend
        if (heightAmar > heightAkbar && heightAmar > heightAnthony) {
            System.out.println("tallest friend is Amar : " + heightAmar);
        } else if (heightAkbar > heightAmar && heightAkbar > heightAnthony) {
            System.out.println("tallest friend is Akbar : " + heightAkbar);
        } else {
            System.out.println("tallest friend is Anthony : " + heightAnthony);
        }
    }
}
