package org.bridgelabz.linearAndBinarysearch.challengeproblem;

import java.util.Arrays;
import java.util.Scanner;

public class SearchChallenge {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int missing = firstMissingPositive(arr.clone());
        System.out.println("First Missing Positive Integer: " + missing);

        System.out.print("Enter target to search: ");
        int target = sc.nextInt();

        Arrays.sort(arr);

        int index = binarySearch(arr, target);

        if (index != -1) {
            System.out.println("Target found at index (sorted array): " + index);
        } else {
            System.out.println("Target not found");
        }

        sc.close();
    }

    public static int firstMissingPositive(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            while (arr[i] > 0 && arr[i] <= n && arr[arr[i] - 1] != arr[i]) {
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }

        return n + 1;
    }

    public static int binarySearch(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}
