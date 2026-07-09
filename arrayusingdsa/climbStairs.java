package arrayusingdsa;

public class climbStairs {
public static int solution (int n) {
	if(n<=2) {
		return n;
	}
	int first=1;
	int second=2;
	for (int i=3;i<=n;i++) {
		int current=first+second;
		first=second;
		second=current;
	}
	return second;
	
}
public static void main (String args[]) {
	int n=10;
	System.out.println(solution(n));
}
}
