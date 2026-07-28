package arrayusingdsa;

import java.util.Arrays;

public class Divideplayer {
	 public static long dividePlayers(int[] skill) {

	        Arrays.sort(skill);

	        int left = 0;
	        int right = skill.length - 1;

	        int target = skill[left] + skill[right];

	        long chemistry = 0;

	        while (left < right) {

	            if (skill[left] + skill[right] != target) {
	                return -1;
	            }

	            chemistry += (long) skill[left] * skill[right];

	            left++;
	            right--;
	        }

	        return chemistry;
	    }

	    public static void main(String[] args) {

	        int[] skill = {3,2,5,1,3,4};

	        System.out.println(dividePlayers(skill));
	    }
}
