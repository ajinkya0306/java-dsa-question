package arrayusingdsa;

public class MinimumSizeSubarraySum {
	public static int minSubArrayLen(int target, int[] nums) {

        int left = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {

            // Expand the window
            sum += nums[right];

            // Shrink the window while condition is satisfied
            while (sum >= target) {
                minLength = Math.min(minLength, right - left + 1);

                sum -= nums[left];
                left++;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
	public static void main (String args[]) {
		int nums[]={2,3,1,2,4,3};
		int target=7;
		int result=minSubArrayLen(target,nums);
		System.out.println(result);
	}
}
