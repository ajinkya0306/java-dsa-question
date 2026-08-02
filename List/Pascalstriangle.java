package List;

import java.util.*;

public class Pascalstriangle {

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {

            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {

                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(result.get(i - 1).get(j - 1)
                          + result.get(i - 1).get(j));
                }
            }

            result.add(row);
        }

        return result;
    }

    public static void main(String[] args) {

        int numRows = 5;

        List<List<Integer>> ans = generate(numRows);

        for (List<Integer> row : ans) {
            System.out.println(row);
        }
    }
}
//
//class Solution {
//    public List<List<Integer>> generate(int numRows) {
//        List<List<Integer>> result = new ArrayList<>(numRows);
//        int[] rowArr = new int[numRows];
//        rowArr[0] = 1;
//        
//        for (int i = 0; i < numRows; i++) {
//            rowArr[i] = 1;
//            for (int j = i - 1; j > 0; j--) {
//                rowArr[j] = rowArr[j] + rowArr[j - 1];
//            }
//            
//            List<Integer> rowList = new ArrayList<>(i + 1);
//            for (int j = 0; j <= i; j++) {
//                rowList.add(rowArr[j]);
//            }
//            result.add(rowList);
//        }
//        
//        return result;
//    }
//}