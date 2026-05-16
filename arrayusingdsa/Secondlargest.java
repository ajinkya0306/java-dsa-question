package arrayusingdsa;
import java.util.Scanner;

public class Secondlargest {

    // Method to find second largest number
    public static int secondLargest(int[] array) {
        int largest, secondLargest;

        // Proper initialization with first two elements
        if (array[0] > array[1]) {
            largest = array[0];
            secondLargest = array[1];
        } else {
            largest = array[1];
            secondLargest = array[0];
        }

        // Loop starts from index 2
        for (int i = 2; i < array.length; i++) {
            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            } else if (array[i] > secondLargest && array[i] != largest) {
                secondLargest = array[i];
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        // If array has less than 2 elements → invalid
        if (n < 2) {
            System.out.println("Array must have at least 2 elements!");
            return;
        }

        int[] array = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int result = secondLargest(array);
        System.out.println("Second largest element is: " + result);
    }
}
