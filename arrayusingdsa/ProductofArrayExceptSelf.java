package arrayusingdsa;

import java.util.Arrays;

public class ProductofArrayExceptSelf {
	 public int[] solution(int[] nums) {
		 
	 int n = nums.length;
     int[] answer = new int[n];

     // Step 1: Store Left Products
     answer[0] = 1;
     for (int i = 1; i < n; i++) {
         answer[i] = answer[i - 1] * nums[i - 1];
     }

     // Step 2: Multiply Right Products
     int rightProduct = 1;
     for (int i = n - 1; i >= 0; i--) {
         answer[i] = answer[i] * rightProduct;
         rightProduct *= nums[i];
     }

     return answer;
 }
	public static void main (String args[]) {
		ProductofArrayExceptSelf obj = new ProductofArrayExceptSelf();

        int[] nums = {1, 2, 3, 4};

        int[] ans = obj.solution(nums);

        System.out.println(Arrays.toString(ans));
	}
}
