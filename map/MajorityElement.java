package map;

import java.util.HashMap;

public class MajorityElement {

	 public static int majorityElement(int[] nums) {
	        HashMap<Integer, Integer> map = new HashMap<>();
	        for (int num : nums) {
	            map.put(num, map.getOrDefault(num, 0) + 1);
	        }
	        for (int key : map.keySet()) {
	        	System.out.println(map.get(key));
	            if (map.get(key) > nums.length / 2) {
	                return key;
	            }
	        }
	        return -1;
	    }

	    public static void main(String[] args) {
	        int[] nums = {3, 3, 4, 2, 2,2,2,2,3};
	        System.out.println(majorityElement(nums)); 
	    }
}
