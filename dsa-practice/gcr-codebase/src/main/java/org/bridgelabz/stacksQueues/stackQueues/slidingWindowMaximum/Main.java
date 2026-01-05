import java.util.*;

public class Main{
    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        SlidingWindowMaximum swm = new SlidingWindowMaximum();
        int[] ans = swm.maxSlidingWindow(arr, k);
        System.out.println(Arrays.toString(ans));
    }
}
