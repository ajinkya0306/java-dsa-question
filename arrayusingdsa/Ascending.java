package arrayusingdsa;
//Gnome Sort
public class Ascending {
	

	
	    static void ascending(int array[]) {
	        int i = 0;
	        while (i < array.length - 1) {
	            if (array[i] > array[i + 1]) {
	                // Swap if elements are not in order
	                int temp = array[i];
	                array[i] = array[i + 1];
	                array[i + 1] = temp;
	                
	                // Move one step back to recheck previous order
	                if (i > 0) {
	                	i--;
	                	}
	            } else {
	                i++;
	            }
	        }
	    }

	    public static void main(String[] args) {
	        int array[] = {4, 3, 5, 2, 1};
	        ascending(array);

	        for (int value : array) {
	            System.out.print(value + " ");
	        }
	    }
	

	
}
//bubble sort 

//package arrayusingdsa;
//
//public class Ascending {
//    static void ascending(int[] array) {
//        int n = array.length;
//        int temp;  
//        
//        // Outer loop → controls number of passes
//        for (int i = 0; i < n - 1; i++) {
//            // Inner loop → compares adjacent elements
//            for (int j = 0; j < n - 1 - i; j++) {
//                if (array[j] > array[j + 1]) {
//                    // Swap if not in order
//                    temp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = temp;
//                }
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        int array[] = {4, 3, 5, 2, 1};
//        ascending(array);
//
//        System.out.println("Array in ascending order:");
//        for (int value : array) {
//            System.out.print(value + " ");
//        }
//    }
//}

