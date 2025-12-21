import java.util.*;
// check if a student is eligible to vote
public class StudentVoteChecker {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.print("age  " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            if (canStudentVote(array[i])) {
                System.out.println("can vote");
            } else {
                System.out.println("can not vote");
            }
        }
    }
    // check if a student is eligible to vote
    public static boolean canStudentVote(int age) {
        return age >= 18;
    }
}
