package arrayusingdsa;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n (range from 1 to n): ");
        int n = sc.nextInt();

        int arr[] = new int[n - 1]; // because 1 number is missing
        System.out.println("Enter " + (n - 1) + " numbers:");
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }

        int missing = findMissing(arr, n);
        System.out.println("Missing number is: " + missing);
    }

    public static int findMissing(int[] arr, int n) {
        int expectedSum = n * (n + 1) / 2; // formula
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}
