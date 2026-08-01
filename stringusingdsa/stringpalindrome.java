package stringusingdsa;

public class stringpalindrome {

	static boolean ispalindrome(String s) {
		int i=0;
		int j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
		
		
	}
	public static void main (String args[]) {
		System.out.println(ispalindrome("madam"));
		System.out.println(ispalindrome("ajinkya"));
	}
}
