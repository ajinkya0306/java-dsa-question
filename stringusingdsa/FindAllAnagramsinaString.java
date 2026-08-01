package stringusingdsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsinaString {
	public static List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        if (p.length() > s.length())
            return ans;

        int[] need = new int[26];
        int[] window = new int[26];

        // Frequency of p
        for (char c : p.toCharArray()) {
            need[c - 'a']++;
        }

        int k = p.length();

        for (int right = 0; right < s.length(); right++) {

            // Add current character
            window[s.charAt(right) - 'a']++;

            // Remove left character if window exceeds size k
            if (right >= k) {
                window[s.charAt(right - k) - 'a']--;
            }

            // Compare frequency arrays
            if (Arrays.equals(need, window)) {
                ans.add(right - k + 1);
            }
        }

        return ans;
    }
	public static void main(String args[]) {
		String s="cbaebabacd";
		String p="abc";
		List<Integer> result=findAnagrams(s,p);
		System.out.println(result);
	}
}
