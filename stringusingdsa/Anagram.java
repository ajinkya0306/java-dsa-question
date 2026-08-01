package stringusingdsa;
import java.util.HashMap;

public class Anagram {
	
	 public static boolean isAnagram(String s1, String s2) {
	        // Normalize: remove spaces, convert to lowercase
	        s1 = s1.replaceAll("\\s", "").toLowerCase();
	        s2 = s2.replaceAll("\\s", "").toLowerCase();

	        // Step 1: If lengths differ → not anagram
	        if (s1.length() != s2.length()) {
	            return false;
	        }

	        // Step 2: Frequency map
	        HashMap<Character, Integer> map = new HashMap<>();

	        // Step 3: Count frequency for first string
	        for (int i = 0; i < s1.length(); i++) {
	            char ch = s1.charAt(i);
	            map.put(ch, map.getOrDefault(ch, 0) + 1);
	        }

	        // Step 4: Decrease frequency using second string
	        for (int i = 0; i < s2.length(); i++) {
	            char ch = s2.charAt(i);
	            if (!map.containsKey(ch)) {
	                return false; // char not in first string
	            }
	            map.put(ch, map.get(ch) - 1);
	        }

	        // Step 5: All frequencies must be 0
	        for (int value : map.values()) {
	            if (value != 0) {
	                return false;
	            }
	        }

	        return true;
	    }

	    public static void main(String[] args) {
	        String s1 = "Dormitory";
	        String s2 = "Dirty room";

	        if (isAnagram(s1, s2))
	            System.out.println("✅ Strings are Anagrams");
	        else
	            System.out.println("❌ Strings are not Anagrams");
	    }
	}

//leetcode apprach 
//if (s.length() != t.length()) {
//    return false;
//}
//
//int[] count = new int[26];
//
//for (int i = 0; i < s.length(); i++) {
//    count[s.charAt(i) - 'a']++;
//    count[t.charAt(i) - 'a']--;
//}
//
//for (int num : count) {
//    if (num != 0) {
//        return false;
//    }
//}
//
//return true;

