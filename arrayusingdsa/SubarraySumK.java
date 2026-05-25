package arrayusingdsa;

import java.util.*;

public class SubarraySumK {

    public static int subarraySum(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int sum = 0;
        int count = 0;

        for (int num : arr) {
            sum += num;

            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int k = 3;

        System.out.println("Subarray Sum Count: " + subarraySum(arr, k));
    }
}
