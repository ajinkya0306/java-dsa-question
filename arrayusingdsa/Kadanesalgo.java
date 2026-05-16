package arrayusingdsa;

public class Kadanesalgo {
	public static int kadanes(int[]arr) {
		int sum=0;
		int max=0;
		for(int num:arr) {
			sum=sum+num;
			if(sum<0) {
				sum=0;
			}
			if(sum>max) {
				max=sum;
			}
			
			
		}
		return max;
	}
	
	public static void main (String args[]) {
		int arr[]= {-2,1-3,4,-5,1,4,6};
		System.out.println(kadanes(arr));
	}
}
