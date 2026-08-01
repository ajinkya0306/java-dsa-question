package stringusingdsa;

public class consecutivecharacter {

	public static int consecutive(String s) {
		int count=1,max=1;
		for (int i=1;i<s.length();i++) {
			if(s.charAt(i)== s.charAt(i-1)){
				count++;
			}else {
				count=1;
			}
			max=Math.max(count, max);
		}
		return max;
	}
	public static void main(String args[]) {
		String s="leetcodeeee";
		System.out.println(consecutive(s));
	}
}
