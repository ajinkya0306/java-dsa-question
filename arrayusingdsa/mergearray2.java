package arrayusingdsa;

import java.util.Arrays;

public class mergearray2 {
	public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] ans = new int[m + n];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < m && j < n) {

            if (nums1[i] <= nums2[j]) {
                ans[k++] = nums1[i++];
            } else {
                ans[k++] = nums2[j++];
            }
        }

        while (i < m) {
            ans[k++] = nums1[i++];
        }

        while (j < n) {
            ans[k++] = nums2[j++];
        }

        for (int x = 0; x < m + n; x++) {
            nums1[x] = ans[x];
        }
    }

    public static void main(String[] args) {

        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};

        merge(nums1,3,nums2,3);

        System.out.println(Arrays.toString(nums1));
    }
}
