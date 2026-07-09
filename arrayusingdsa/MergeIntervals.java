package arrayusingdsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> ans = new ArrayList<>();

        int[] newinterval = intervals[0];
        ans.add(newinterval);

        for (int[] interval : intervals) {

            if (interval[0] <= newinterval[1]) {

                newinterval[1] = Math.max(newinterval[1], interval[1]);

            } else {

                newinterval = interval;
                ans.add(newinterval);
            }
        }

        return ans.toArray(new int[ans.size()][]);
    }

    public static void main(String[] args) {

        MergeIntervals obj = new MergeIntervals();

        int[][] intervals = {
                {1, 3},
                {2, 6},
                {8, 10},
                {15, 18}
        };

        System.out.println("Original Intervals:");
        for (int[] interval : intervals) {
            System.out.println(Arrays.toString(interval));
        }

        int[][] result = obj.merge(intervals);

        System.out.println("\nMerged Intervals:");
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }
}