package arrayusingdsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval {
	 public static int[][] insert(int[][] intervals, int[] newInterval) {

	        List<int[]> result = new ArrayList<>();

	        int i = 0;
	        int n = intervals.length;

	        // Step 1: Add all intervals before newInterval
	        while (i < n && intervals[i][1] < newInterval[0]) {
	            result.add(intervals[i]);
	            i++;
	        }

	        // Step 2: Merge overlapping intervals
	        while (i < n && intervals[i][0] <= newInterval[1]) {
	            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
	            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
	            i++;
	        }

	        // Add the merged interval
	        result.add(newInterval);

	        // Step 3: Add the remaining intervals
	        while (i < n) {
	            result.add(intervals[i]);
	            i++;
	        }

	        // Convert List<int[]> to int[][]
	        return result.toArray(new int[result.size()][]);
	    }

    public static void main(String[] args) {


        int[][] intervals = {
                {1, 2},
                {3, 5},
                {6, 7},
                {8, 10},
                {12, 16}
        };

        int[] newInterval = {4, 8};

        int[][] ans =  insert(intervals, newInterval);

        System.out.println("Output:");

        for (int[] interval : ans) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
