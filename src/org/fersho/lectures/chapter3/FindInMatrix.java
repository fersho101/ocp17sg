package org.fersho.lectures.chapter3;

public class FindInMatrix {
    public static void main(String[] args) {

        int[][] list = { { 1, 13 }, { 5, 20 }, { 2, 2 } };
        int searchValue = 2;
        int posX = -1;
        int posY = -1;

        PARENT_LOOP: for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if (list[i][j] == searchValue) {
                    posX = i;
                    posY = j;
                    break PARENT_LOOP;
                }
            }
        }
        if (posX == -1 || posY == -1) {
            System.out.printf("Value: %d, not found", searchValue);
        } else {
            System.out.printf("Value: %d, found at (%d, %d)", searchValue, posX, posY);
        }
    }
}
