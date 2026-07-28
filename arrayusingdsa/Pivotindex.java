package arrayusingdsa;

public class Pivotindex {

	public static int pivot(int[] nums) {
		int totalsum=0;
		for(int num:nums) {
			totalsum+=num;
		}
		int leftsum=0;
		for(int i =0;i<nums.length;i++) {
			int rightsum=totalsum-leftsum-nums[i];
			if(rightsum==leftsum) {
				return i;
			}
			leftsum+=nums[i];
		}
		return -1;
	}
	
	public static void main (String args[]) {
		int nums[]= {1,7,3,6,5,6};
		int result=pivot(nums);
		System.out.println(result);
	}
}
