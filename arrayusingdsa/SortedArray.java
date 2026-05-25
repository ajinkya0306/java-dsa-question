package arrayusingdsa;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    // Method to check if array is sorted in ascending order
    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false; // Found an unsorted pair
            }
        }
        return true; // All elements in ascending order
    }

    // Method to sort array in ascending order
    public static void sortArray(int[] array) {
        Arrays.sort(array); // Java built-in sort
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] array = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        // Check if array is already sorted
        if (!isSorted(array)) {
            sortArray(array);
            System.out.println("Array was not sorted. Sorted array: ");
        } else {
            System.out.println("Array is already sorted: ");
        }

        // Print array
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
