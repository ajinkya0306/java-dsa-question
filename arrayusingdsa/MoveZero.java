package arrayusingdsa;

import java.util.Scanner;

public class MoveZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of the array: ");
        int length = sc.nextInt();

        int arr[] = new int[length];

        System.out.println("Enter " + length + " elements:");
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }

        moveZerosToEnd(arr);

        System.out.println("Array after moving zeros to end:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void moveZerosToEnd(int[] arr) {
        int index = 0; // position to place next non-zero element

        // Step 1: Move all non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

        // Step 2: Fill remaining places with zeros
        while (index < arr.length) {
            arr[index++] = 0;
        }
    }
}
