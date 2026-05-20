package hashset;

import java.util.HashSet;

public class duplicate {
	static boolean duplicate(int arr[]) {
		HashSet<Integer>set=new HashSet<>();
		 for (int num : arr) {
	            if (set.contains(num)) {
	                return true; // duplicate found
	            }
	            set.add(num);
	        }
	        return false;
	}
	public static void main (String args[]) {
		int arr[]= {1,2,3,1};
		System.out.println(duplicate(arr)); 
	}

}
