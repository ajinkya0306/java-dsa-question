package arrayusingdsa;

import java.util.Scanner;

public class LeftRotate {

    // Function to left rotate array by k positions
    static void leftRotate(int arr[], int k) {
        int n = arr.length;
        k = k % n; // in case k > n
        for (int i = 0; i < k; i++) {
            int first = arr[0]; // store first element
            // shift all elements left by one
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = first; // move first element to end
        }
    }

    // Function to display array
    static void display(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number of positions to rotate: ");
        int k = sc.nextInt();

        leftRotate(arr, k);

        System.out.println("Array after left rotation:");
        display(arr);

        sc.close();
    }
}
