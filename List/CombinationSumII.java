package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
	   public static List<List<Integer>> combinationSum2(int[] candidates, int target) {

	        Arrays.sort(candidates);

	        List<List<Integer>> ans = new ArrayList<>();

	        backtrack(candidates, target, 0, new ArrayList<>(), ans);

	        return ans;
	    }

	    private static void backtrack(int[] candidates,
	                                  int target,
	                                  int start,
	                                  List<Integer> current,
	                                  List<List<Integer>> ans) {

	        if (target == 0) {
	            ans.add(new ArrayList<>(current));
	            return;
	        }

	        for (int i = start; i < candidates.length; i++) {

	            // Skip duplicates
	            if (i > start && candidates[i] == candidates[i - 1]) {
	                continue;
	            }

	            // No need to continue
	            if (candidates[i] > target) {
	                break;
	            }

	            current.add(candidates[i]);

	            backtrack(candidates,
	                      target - candidates[i],
	                      i + 1,
	                      current,
	                      ans);

	            current.remove(current.size() - 1);
	        }
	    }

	    public static void main(String[] args) {

	        int[] candidates = {10,1,2,7,6,1,5};
	        int target = 8;

	        System.out.println(combinationSum2(candidates, target));
	    }
}
