package arrayusingdsa;

public class MaxConsecutiveOnes {

    public static int findMax(int arr[]) {

        int count = 0;
        int max = 0;

        for (int num : arr) {

            if (num == 1) {

                count++;

                max = Math.max(max, count);

            } else {

                count = 0;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int arr[] = {1,1,0,1,1,1};

        System.out.println(findMax(arr));
    }
}
