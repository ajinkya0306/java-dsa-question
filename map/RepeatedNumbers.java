package map;

import java.util.HashMap;

public class RepeatedNumbers {
	 public static void main(String[] args) {
	        int[] nums = {3, 3, 4, 4, 5, 6, 7, 7, 8};

	        HashMap<Integer, Integer> map = new HashMap<>();

	        // Count frequency of each number
	        for (int num : nums) {
	            map.put(num, map.getOrDefault(num, 0) + 1);
	        }

	        System.out.println("Repeated Numbers:");
	        boolean found = false;

	        // Print numbers that appear more than once
	        for (int key : map.keySet()) {
	            if (map.get(key) > 1) {
	                System.out.println(key + " → appears " + map.get(key) + " times");
	                found = true;
	            }
	        }

	        if (!found)
	            System.out.println("No repeated numbers found.");
	    }

}
