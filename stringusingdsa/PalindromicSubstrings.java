package stringusingdsa;

public class PalindromicSubstrings {
    static int count = 0;

    public static int countSubstrings(String s) {
        count = 0;
        for (int i = 0; i < s.length(); i++) {
            // Odd length palindrome
            expand(s, i, i);
            // Even length palindrome
            expand(s, i, i + 1);
        }
        return count;
    }
    public static void expand(String s, int left, int right) {
        while (left >= 0 &&
               right < s.length() &&
               s.charAt(left) == s.charAt(right)) {
            count++;
            left--;
            right++;
        }
    }
    public static void main(String[] args) {
        String s = "aaa";
        System.out.println(countSubstrings(s));
    }
}
