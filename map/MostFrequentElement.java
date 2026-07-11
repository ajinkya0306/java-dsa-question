package map;

import java.util.*;

public class MostFrequentElement {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 1, 2, 4, 1, 1};

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        int mostFrequent = -1;

        // Find most frequent element
        for (Integer key : map.keySet()) {

            if (map.get(key) > maxFreq) {
                maxFreq = map.get(key);
                mostFrequent = key;
            }

        }

        System.out.println("maximum  frequent  number : "+ mostFrequent);
        System.out.println("maximum frequency of number : "+maxFreq);
    }
}