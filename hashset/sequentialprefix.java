package hashset;

import java.util.HashSet;

public class sequentialprefix {
	public static int missinginteger(int [] arr) {
		int sum =arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]==arr[i-1]+1) {
				sum=sum+arr[i];
			}else {
				break;
			}
		}
		HashSet<Integer>set= new HashSet<>();
		for(int num : arr) {
			set.add(num);
		}
		while(set.contains(sum)) {
			sum++;
		}
		return sum;
	}
	public static void main (String args[]){
		int arr[]= {1,2,3,5,4,7};//[3,4,5,1,12,14,13] put this arrya o understand 
		int result =missinginteger(arr);
		System.out.println(result);
	}
	
}
