package arrayusingdsa;

import java.util.HashSet;

public class intersectiontwoarray {
	public static HashSet<Integer> intersection(int a[],int b[]){
		HashSet<Integer>set=new HashSet();
		HashSet<Integer>set2=new HashSet();

		for(int x:a) {
			set.add(x);
		}
		for(int y:b) {
			if(set.contains(y)) {
				set2.add(y);
			}
		}
		
		return set2;
		//add int method type is int[]  
//		int result[]=new int[set2.size()];
//        int index=0;
//        for(int num:set2){
//            result[index++]=num;
//        }
//        return result;
	}
	public static void main (String args[]) {
		int a[]= {1,2,3,4};
		int b[]= {3,4,5,6,7,8};
		HashSet<Integer> output=intersection(a,b);
		System.out.println(output);
	}

}
