package arrayusingdsa;

import java.util.HashSet;

public class Union {
	public static HashSet<Integer> unionelement(int a[],int b[]) {
		HashSet<Integer>ans=new HashSet();
		
		for(int x:a) {
			ans.add(x);
		}
		for(int y:b) {
			ans.add(y);
		}
		
		return ans;
	}

	public static void main (String args[]) {
		int a[]= {1,2,3,4};
		int b[]= {3,4,5,6,7};
		HashSet<Integer>output=unionelement(a,b);
		System.out.println(output);
	}
}
