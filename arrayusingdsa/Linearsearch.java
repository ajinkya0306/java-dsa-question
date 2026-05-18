package arrayusingdsa;

public class Linearsearch {

	public static int search(int[]arr,int x) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				return 1;
			}
		}
		return -1;
	}
	public static void main (String args[]) {
		int [] arr= {1,4,5,7,6,8};
		int ans = search(arr,8);
		System.out.println(ans);
	}
}
