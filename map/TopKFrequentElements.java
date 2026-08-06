package map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {
	 public int[] Solution(int[] nums, int k) {

	        // Step 1: Count frequency
	        HashMap<Integer, Integer> map = new HashMap<>();

	        for (int num : nums) {
	            map.put(num, map.getOrDefault(num, 0) + 1);
	        }

	        // Step 2: Min Heap based on frequency
	        PriorityQueue<Map.Entry<Integer, Integer>> pq =
	                new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());

	        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
	            pq.offer(entry);

	            if (pq.size() > k) {
	                pq.poll();
	            }
	        }

	        // Step 3: Store answer
	        int[] ans = new int[k];

	        for (int i = k - 1; i >= 0; i--) {
	            ans[i] = pq.poll().getKey();
	        }

	        return ans;
	    }

	    public static void main(String[] args) {
	    	TopKFrequentElements obj = new TopKFrequentElements();

	        int[] nums = {1, 1, 1, 2, 2, 3};
	        int k = 2;

	        int[] result = obj.Solution(nums, k);

	        System.out.println(Arrays.toString(result));
	    }
}
