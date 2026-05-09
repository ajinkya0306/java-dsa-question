package arrayusingdsa;

import java.util.Scanner;

public class Average {

    // Method to calculate sum
    public static int addition(int num[]) {
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        return sum;
    }

    // Method to calculate average
    public static double average(int num[]) {
        int sum = addition(num); // reuse sum method
        return (double) sum / num.length;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = sc.nextInt();

        int num[] = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }

        System.out.print("Array elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();

        int sum = addition(num);
        System.out.println("Sum of array: " + sum);

        double avg = average(num);
        System.out.println("Average of array: " + avg);
    }
}
