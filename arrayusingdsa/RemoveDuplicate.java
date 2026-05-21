package arrayusingdsa;

import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of the array: ");
        int length = sc.nextInt();

        int arr[] = new int[length];
        System.out.println("Enter " + length + " sorted elements:");
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }

        int newLength = removeDuplicates(arr);

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;

        int index = 1; // position for next unique element

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {  // found new element
                arr[index] = arr[i];
                index++;
            }
        }

        return index; // new length of unique array
    }
}
