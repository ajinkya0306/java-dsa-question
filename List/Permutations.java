package List;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        boolean[] used = new boolean[nums.length];

        backtrack(nums, used, new ArrayList<>(), ans);

        return ans;
    }

    public static void backtrack(int[] nums,
                                 boolean[] used,
                                 List<Integer> current,
                                 List<List<Integer>> ans) {

        // Base Case
        if (current.size() == nums.length) {
            ans.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            // Skip if already used
            if (used[i]) {
                continue;
            }

            // Choose
            current.add(nums[i]);
            used[i] = true;

            // Explore
            backtrack(nums, used, current, ans);

            // Backtrack (Undo)
            current.remove(current.size() - 1);
            used[i] = false;
        }
    }

    // Main Method
    public static void main(String[] args) {

        int[] nums = {1, 2, 3};

        List<List<Integer>> result = permute(nums);

        System.out.println("All Permutations:");

        for (List<Integer> permutation : result) {
            System.out.println(permutation);
        }
    }
}