package arrayusingdsa;

import java.util.Arrays;
import java.util.Scanner;

public class Plusone {
	public static int[] plus(int[] digits) {
        int n = digits.length;

        // Traverse from last digit to the first
        for (int i = n - 1; i >= 0; i--) {
            // If current digit is less than 9, simply add 1 and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // No carry, so return the result
            }

            // If current digit is 9, it becomes 0 and we carry 1 to next left digit
            digits[i] = 0;
        }

        // If all digits like 9, 99, 999, need an extra digit at the beginning
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1; // e.g., 999 + 1 = 1000
        return newNumber;
    }

    public static void main(String[] args) {
    	Scanner sc  = new Scanner(System.in);
    	int size =sc.nextInt();
    	int digits[] = new int[size];
    	for(int i=0;i<size;i++) {
    		digits[i]=sc.nextInt();
    	}
    	// int[] digits = {9, 9, 9};
        int[] result = plus(digits);
//	        for(int i=0;i<result.length;i++) {
//	        	System.out.print(result[i]+" , ");
//	        }
           System.out.println(Arrays.toString(result));  // prints [1, 0, 0, 0]
    }

}
