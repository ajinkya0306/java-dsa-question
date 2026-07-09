package arrayusingdsa;

public class Containerwithmostwater {
	public static int maxArea(int [] height) {
		int left=0;
		int right=height.length-1;
		int maxwater=0;
		while(left<right) {
			int distance=right-left;
			int minheight = Math.min(height[left], height[right]);
			int area=distance*minheight;
			maxwater=Math.max(maxwater, area);
			if(height[left]<height[right]) {
				left++;
			}else {
				right--;
			}
		}
		return maxwater;
	}

	public static void main (String args[]) {
		int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height)); 
	}
}
