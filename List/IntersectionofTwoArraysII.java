package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class IntersectionofTwoArraysII {
	 public static int[] intersect(int[] nums1, int[] nums2) {

	        HashMap<Integer, Integer> map = new HashMap<>();

	        // Count frequency of nums1
	        for (int num : nums1) {
	            map.put(num, map.getOrDefault(num, 0) + 1);
	        }

	        List<Integer> list = new ArrayList<>();

	        // Check nums2
	        for (int num : nums2) {

	            if (map.containsKey(num) && map.get(num) > 0) {

	                list.add(num);

	                map.put(num, map.get(num) - 1);
	            }
	        }

	        int[] ans = new int[list.size()];

	        for (int i = 0; i < list.size(); i++) {
	            ans[i] = list.get(i);
	        }

	        return ans;
	    }

	    public static void main(String[] args) {

	        int[] nums1 = {1,2,2,1};
	        int[] nums2 = {2,2};

	        System.out.println(Arrays.toString(intersect(nums1, nums2)));
	    }
}
