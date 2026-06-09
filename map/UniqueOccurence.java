package map;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueOccurence {

	static boolean unique(int [] arr) {
		HashMap <Integer,Integer>map=new HashMap<>();
		for(int num:arr) {
			map.put(num, map.getOrDefault(num,0)+1);
		}
		
		HashSet <Integer>set=new HashSet<>();
		for (int freq:map.values()){
			if(set.contains(freq)) {
				return false;
			}
			set.add(freq);
		}
		return true;
	}
	
	public static void main (String args[]) {
		int arr[]= {1,2,3,1,3,3};
		boolean result=unique(arr);
		System.out.println(result);
	}
}
//here 1 repear 2times
//2 - 1 time
//3 -3times all repeat are different therefore true 