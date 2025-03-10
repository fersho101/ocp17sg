package org.fersho.lectures.ch03_making_decisions;

public class FindInMatrixUsingReturn {

    private static int[] searchForValue(int[][] list, int v) {
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if (list[i][j] == v) {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {

        int[][] list = { { 1, 13 }, { 5, 20 }, { 2, 2 } };
        int searchValue = 2;
        int[] results = searchForValue(list, searchValue);        
        if (results == null) {
            System.out.printf("Value: %d, not found", searchValue);
        } else {
            System.out.printf("Value: %d, found at (%d, %d)", searchValue, results[0], results[1]);
        }
    }

}
