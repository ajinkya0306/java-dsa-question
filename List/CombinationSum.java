package List;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();

        backtrack(0, candidates, target, new ArrayList<>(), ans);

        return ans;
    }

    public static void backtrack(int index,
                                 int[] candidates,
                                 int target,
                                 List<Integer> current,
                                 List<List<Integer>> ans) {

        // Base Case 1
        if (target == 0) {
            ans.add(new ArrayList<>(current));
            return;
        }

        // Base Case 2
        if (target < 0) {
            return;
        }

        for (int i = index; i < candidates.length; i++) {

            // Choose
            current.add(candidates[i]);

            // Explore
            backtrack(i, candidates, target - candidates[i], current, ans);

            // Undo
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {

        int[] candidates = {2,3,6,7};
        int target = 7;

        List<List<Integer>> ans = combinationSum(candidates, target);

        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }
}