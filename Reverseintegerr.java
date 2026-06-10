
public class Reverseintegerr {
	

	

		static int reverse(int x) {
			int rev=0;
			while(x!=0) {
				int digit=x%10;
				 x=x/10;
				 rev=rev*10+digit;
			}
		     
			
			
			return rev;
		}
		public static void main (String args[]) {
			int x=-123;
			int result =reverse(x);
			System.out.println(result);
		}
	

}
