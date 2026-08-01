package stringusingdsa;

public class numberpalindrome {
	static boolean ispalindrome(int n) {
		int original = n;
		int rev=0;
		while(n>0) {
			int digit=n%10;
			rev=rev*10+digit;
			n=n/10;
		}
		if( original==rev) {
			return true;
		}
		return false;
	}
	public static void main (String args[]) {
		System.out.println(ispalindrome(121));
		System.out.println(ispalindrome(123));
	}

}
