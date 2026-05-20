package map;

import java.util.*;

public class UniqueElements {
    public static void main(String[] args) {
        int[] nums = {3, 3, 4, 4, 5, 6, 7, 7, 8};

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency of each number
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println("Unique Elements:");
        

        // Print numbers that appear only once
        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                System.out.println(key + " → appears only once");
                boolean found = true;
            }
        }
        boolean found = false;
        
        if (!found)
            System.out.println("No unique elements found.");
    }
}
