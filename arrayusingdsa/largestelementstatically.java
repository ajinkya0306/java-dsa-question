package arrayusingdsa;

import java.util.Scanner;

public class largestelementstatically {
	
	public static int findlargest(int arr[]) {
		int largest=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(	arr[i]>largest) {
				largest=arr[i];
			}
			
		}
		return largest;
	}
	public static int largest(int arr[]) {
		int largest=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(	arr[i]>largest) {
				largest=arr[i];
			}
			
		}
		return largest;
	}
	
	public static void main(String args[]) {
		//using statically 
		int arr[]= {90,109,23,134,34};
		int largest=findlargest(arr);
	System.out.println(largest);
		
		//using scanner(dynamically)
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an array:");
		int size =sc.nextInt();
		int num[]=new int[size];
		System.out.println("entre element in array");
		for(int i=0;i<size;i++) {
			num[i]=sc.nextInt();
		}
		int larg=largest(num);
		System.out.println("largest number is");
		System.out.println(larg);
		sc.close();
	}

}
