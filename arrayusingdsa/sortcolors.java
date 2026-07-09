package arrayusingdsa;

import java.util.Arrays;

//basically we arrange array in sort way like(0,0,1,1,2,2,2)
public class sortcolors {

	public   void solution(int[]nums) {
		int start=0;
		int mid=0;
		int end=nums.length-1;
		
		while(mid<=end) {
			if(nums[mid]==0) {
				swap(nums,start,mid);
				start++;
				mid++;
			}
			else if(nums[mid]==1){
				mid++;
			}
			else {
				swap(nums,mid,end);
				end--;
			}
		}
		
		
	}
	private static void swap(int []nums,int i,int j) {
		int temp=nums[i];
		nums[i]=nums[j];
		nums[j]=temp;
		
	}
	public static void main (String args[]) {
		int nums[]= {1,2,0,1,0,2};
		sortcolors sol = new sortcolors();
		sol.solution(nums);
		System.out.println(Arrays.toString(nums));
	}
}
