package stringusingdsa;

public class validpalindromedeleteplaceone {
	static boolean validPalindrome(String s) {
		 int left = 0, right = s.length() - 1;

	        while (left < right) {
	            if (s.charAt(left) == s.charAt(right)) {
	                left++;
	                right--;
	            } else {
	                // Mismatch: try deleting one character (either left or right)
	                return isPal(s, left + 1, right) || isPal(s, left, right - 1);
	            }
	        }
	        return true; // all characters matched
	    }

	    // helper to check normal palindrome between two indices
	    static boolean isPal(String s, int l, int r) {
	        while (l < r) {
	            if (s.charAt(l++) != s.charAt(r--)) {
	                return false;
	            }
	        }
	        return true;
	    }


	public static void main(String[] args) {
	    System.out.println(validPalindrome("abca")); // true
	    System.out.println(validPalindrome("abc"));  // false
	    System.out.println(validPalindrome("madam")); // true
	}


}
