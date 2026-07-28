package arrayusingdsa;

public class SearchinRotatedSortedArray {
	  public static int search(int[] nums, int target) {
	        int left = 0;
	        int right = nums.length - 1;

	        while (left <= right) {
	            int mid = left + (right - left) / 2;

	            if (nums[mid] == target) {
	                return mid;
	            }  if (nums[left] <= nums[mid]) {

	                if (target >= nums[left] && target < nums[mid]) {
	                    right = mid - 1;
	                } else {
	                    left = mid + 1;
	                }

	            }
	            // Right half is sorted
	            else {

	                if (target > nums[mid] && target <= nums[right]) {
	                    left = mid + 1;
	                } else {
	                    right = mid - 1;
	                }

	            }
	        }

	        return -1;
	    }
	    public static void main(String args[]){
	        int nums[]={5,7,7,8,8,10};
	        System.out.println(search(nums,8));
	        System.out.println(search(nums,6));
	        System.out.println(search(nums,0));
	    }
}
