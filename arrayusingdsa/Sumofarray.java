package arrayusingdsa;

import java.util.Scanner;

public class Sumofarray {
	public static int addition(int num[]) {
		int sum=0;
		for(int i=0;i<num.length;i++) {
			sum=num[i]+sum;
		}
		return sum;

	}
	 public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter size of array:");
		 int size=sc.nextInt();
		 int num[]=new int[size];
		 for(int i=0;i<size;i++) {
			 num[i]=sc.nextInt() ;
		 }
		 for(int i =0;i<size;i++) {
		 System.out.print(num[i]+" ");
		 }
		 System.out.println();
		 int sum=addition(num);
		 System.out.println(sum);
	 }

}
