package arrayusingdsa;

import java.util.Scanner;

public class Occuranceelement {
	public static int occurence(int num[],int target) {
		int count = 0;
		for(int i=0;i<num.length;i++) {
			
				if(num[i]==target) {
					count++;
				
			}
		}
		return count;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of an array: ");
		int size=sc.nextInt();
		int num[]=new int[size];
		System.out.println("enter element of ana array: ");
		for(int i =0;i<size;i++) {
			num[i]=sc.nextInt();
		}
		for(int i =0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
		System.out.println("target element : ");
		int target=sc.nextInt();
		int a=occurence(num,target);
		System.out.println(a);
	}
}
