package arrayusingdsa;

public class MaximumAverageSubarrayI {

	public static double maxaverage(int nums[],int k ) {
		int sum =0;
		for(int i =0;i<k;i++) {
			sum+=nums[i];
		}
		int maxsum=sum;
		for (int i=k;i<nums.length;i++) {
			sum+=nums[i];
			sum-=nums[i-k];
			maxsum=Math.max(maxsum, sum);
		}
		return (double) maxsum/k;
	}
	public static void main (String args[]) {
		int nums[]= {1,2,3,4,5,6,7,8,9,10};
		int k=5;
		double result=maxaverage(nums,k);
		System.out.println(result);
	}
}
