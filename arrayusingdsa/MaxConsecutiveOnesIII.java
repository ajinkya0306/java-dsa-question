package arrayusingdsa;

public class MaxConsecutiveOnesIII {
	
	    public static int longestOnes(int[] nums, int k) {

	        int left = 0, right=0;
	        int zeroCount = 0, maxLength = 0;
	        
	        while(right<nums.length) {
	        	if(nums[right]==0) {
	        		zeroCount++;
	        	}
	        	while(zeroCount>k) {
	        		if(nums[left]==0) {
	        			zeroCount--;
	        		}
	        		left++;
	        	}
	        	 maxLength=Math.max(maxLength, right-left+1);
	        	 right++;
	        }
	       

	        

	        return maxLength;
	    }
	    
	     public static void main(String args[]) {
	    	int nums[] = {1,1,1,0,0,0,1,1,1,1,0};
	    	int k=2;
	    	int result=longestOnes(nums,k);
	    	System.out.println(result);
	     }
	}

