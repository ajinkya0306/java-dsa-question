package map;

import java.util.HashMap;

public class Secondmostfrequentelement {

    static int secondfrequent(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int firstfrequency = 0;
        int secondfrequency = 0;

        int firstnumber = -1;
        int secondnumber = -1;

        for (int key : map.keySet()) {

            int frequency = map.get(key);

            if (frequency > firstfrequency) {

                secondfrequency = firstfrequency;
                secondnumber = firstnumber;

                firstfrequency = frequency;
                firstnumber = key;

            } else if (frequency > secondfrequency &&
                       frequency < firstfrequency) {

                secondfrequency = frequency;
                secondnumber = key;
            }
        }

        return secondnumber;
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 3, 2, 2, 2};

        int result = secondfrequent(arr);

        System.out.println(result);
    }
}