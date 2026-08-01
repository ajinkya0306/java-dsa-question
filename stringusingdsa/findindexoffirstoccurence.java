package stringusingdsa;

public class findindexoffirstoccurence {

	public static int solution(String haystack,String needle) {
		int m =haystack.length();
		int n=needle.length();
		
		for(int i=0;i<=m-n;i++) {
			int j=0;
			while(j<n && haystack.charAt(i+j)==needle.charAt(j)) {
				j++;
			}
			if(j==n) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main (String args[]) {
		String haystack="sadbutsad";
		String needle="sad";
		System.out.println(solution(haystack,needle));
	}
}
