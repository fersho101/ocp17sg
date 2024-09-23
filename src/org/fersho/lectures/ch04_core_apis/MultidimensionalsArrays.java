package org.fersho.lectures.ch04_core_apis;

public class MultidimensionalsArrays {
    public static void main(String[] args) {

        // Creating multidimensinals arrays
        int[][] vars1; // best way
        int vars2[][]; // 2D arr
        int[] vars3[]; // 2D arr
        int vars4, space[][]; // 2D arr and 3D arr

        int[][] arr2D = new int[3][3];
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                arr2D[i][j] = i;
            }
        }

        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n*** *** ***\n");
        String[][] rectangle = new String[3][4];
        rectangle[0][1] = "set";
        for (int i = 0; i < rectangle.length; i++) {
            for (int j = 0; j < rectangle[i].length; j++) {
                System.out.print(rectangle[i][j] + " ");
            }
            System.out.println();
        }

        //creatina a multidemensinal asymetric array
        int[][] nms2 = new int[4][]; // initialize array's first dimension
        nms2[0] = new int[5]; // then define the size of each array component
        nms2[1] = new int[2]; // then define the size of each array component
    }

}
