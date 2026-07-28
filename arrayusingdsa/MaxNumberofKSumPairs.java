package arrayusingdsa;

import java.util.Arrays;

public class MaxNumberofKSumPairs {
	 public static int maxOperations(int[] nums, int k) {

	        Arrays.sort(nums);

	        int left = 0;
	        int right = nums.length - 1;

	        int count = 0;

	        while (left < right) {

	            int sum = nums[left] + nums[right];

	            if (sum == k) {
	                count++;
	                left++;
	                right--;
	            } else if (sum < k) {
	                left++;
	            } else {
	                right--;
	            }
	        }

	        return count;
	    }

	    public static void main(String[] args) {

	        int[] nums = {1,2,3,4};

	        System.out.println(maxOperations(nums,5));
	    }
}
