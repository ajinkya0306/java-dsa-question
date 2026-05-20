package map;

import java.util.*;

public class SubarraySumEqualsK {
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // Base case: prefix sum 0 has 1 count

        int sum = 0, count = 0;

        for (int num : nums) {
            sum += num; // update prefix sum
            
            if (map.containsKey(sum - k)) {
            
            	count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2,2};
        int k = 3;
        System.out.println(subarraySum(nums, k)); // Output: 2
    }
}
