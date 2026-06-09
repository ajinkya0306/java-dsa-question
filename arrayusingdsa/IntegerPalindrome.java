package arrayusingdsa;

public class IntegerPalindrome {
	 static boolean palindrome(int x) {
		 if(x<0) {
			 return false;
		 }
		 String str=String.valueOf(x);
		 int left=0;
		 int right=str.length()-1;
		 while(left<right) {
			 if(str.charAt(left)!=str.charAt(right)) {
				 return false;
			 }
			 left++;
			 right--;
		 }
		return true;
	}
	public static void main (String args[]) {
		int x=121;
		boolean result=palindrome(x);
		System.out.println(result);
	}

}
