package arrayusingdsa;

public class FindMinimuminRotatedSortedArray {

	public static int findmin(int []nums) {
		int left=0;
		int right=nums.length-1;
		while(left<right) {
			int mid=left+(right-left)/2;
			if(nums[mid]>nums[right]) {
				left=mid+1;
			}else {
				right=mid;
			}
		}
		return nums[left];
	}
	public static void main (String args[]) {
		int nums[]= {7,8,9,0,1,2};
		int result=findmin(nums);
		System.out.println(result);
	}
}
