package arrayusingdsa;

public class mergearray {

	public static int[] merge(int a[],int b[]) {
		int i=0,j=0,k=0;
		int result[]=new int[a.length+b.length];
		while(i<a.length&&j<b.length) {
			if(a[i]<b[j]) {
				result[k]=a[i];
				k++;
				i++;
			}else {
				result[k]=b[j];
				k++;
				j++;
			}
		}
		while(i<a.length) {
			result[k]=a[i];
			k++;
			i++;
		}
		while(j<b.length) {
			result[k]=b[j];
			k++;
			j++;
		}
		return result;
	}
	public static void main (String args[]) {
		int a[]= {1,2,3,4};
		int b[]= {5,6,7,8};
		int ans[]=merge(a,b);
		for(int x:ans) {
			System.out.print(x+"");
		}
	}
}
