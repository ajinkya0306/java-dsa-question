package List;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), ans);
        return ans;
    }

    public static void backtrack(int index, int[] nums, List<Integer> current, List<List<Integer>> ans) {

        
        ans.add(new ArrayList<>(current));

       
        for (int i = index; i < nums.length; i++) {
            current.add(nums[i]);                
            backtrack(i + 1, nums, current, ans); 
            current.remove(current.size() - 1);   
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};

        List<List<Integer>> result = subsets(nums);

        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }
}
