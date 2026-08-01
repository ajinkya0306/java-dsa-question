package stringusingdsa;

public class IsSubsequence {
	public boolean isSubsequence(String s, String t) {

        int i = 0; // Pointer for s
        int j = 0; // Pointer for t

        while (i < s.length() && j < t.length()) {

            if (s.charAt(i) == t.charAt(j)) {
                i++; // Move to the next character in s
            }

            j++; // Always move to the next character in t
        }

        return i == s.length();
    }
	 public static void main(String[] args) {

		 IsSubsequence sol = new IsSubsequence();

	        // Test Case 1
	        System.out.println(sol.isSubsequence("abc", "ahbgdc")); // true

	        // Test Case 2
	        System.out.println(sol.isSubsequence("axc", "ahbgdc")); // false

	        // Test Case 3
	        System.out.println(sol.isSubsequence("", "ahbgdc")); // true

	        // Test Case 4
	        System.out.println(sol.isSubsequence("ace", "abcde")); // true

	        // Test Case 5
	        System.out.println(sol.isSubsequence("aec", "abcde")); // false
	    }
}
