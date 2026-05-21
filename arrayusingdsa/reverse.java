package arrayusingdsa;

import java.util.Scanner;

public class reverse {
	public static void reverse(int num[]) {
		int a=num.length-1;
		int b;
		for(int i=0;i<num.length/2;i++) {
			b=num[i];
			num[i]=num[a];
			num[a]=b;
			a--;
		}
		
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of an array:");
		int size=sc.nextInt();
		
		int []num=new int[size];
		for(int i =0;i<size;i++) {
			num[i]=sc.nextInt();
		}
		for(int i=0;i<num.length;i++) {
		System.out.print(num[i]+" ");
		}
		System.out.println();
		reverse(num);
		for(int value:num) {
		System.out.print(value+" ");
		}
	}

}
