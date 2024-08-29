package org.fersho.lectures.chapter3;

public class Loops {

    int roomInBelly = 7;

    void eatCheese(int bitesOfCheese) {
        while (bitesOfCheese > 0 && roomInBelly > 0) {
            bitesOfCheese--;
            roomInBelly--;
        }
        System.out.println(bitesOfCheese + " pieces of cheese left");
    }

    void forLoop(int x) {
        for (int i = 0; i < x; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    void forLoopReverse(int x) {
        for (int i = x; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    void multiTermsForLoop(int x) {
        for (long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
            System.out.print(y + " " + z);
        }
        System.out.println(x + " ");
    }

    void forEachLoop(String[] arr) {
        for (String name : arr) {
            System.out.print(name + " ");
        }
    }

    // Nested loops

    void nestedLoops(int[][] arr) {
        for (int[] myArr : arr) {
            for (int i = 0; i < myArr.length; i++) {
                System.out.print(myArr[i] + "\t");
            }
            System.out.println();
        }
    }

    void nestedLoops2(int x) {
        while (x > 0) {
            do {
                x -= 2;
            } while (x > 5);
            x--;
            System.out.println(x + ",");
        }
    }

    public static void main(String[] args) {

        Loops ej01 = new Loops();
        String[] names = { "Jesus", "Jose", "Maria", "Juan", "Atonio", "Fernando", "Angel", "Elsa" };
        int[][] nums = { { 5, 2, 1, 3 }, { 3, 9, 9, 9 }, { 5, 7, 12, 7 } };

        ej01.eatCheese(9);

        ej01.forLoop(10);
        ej01.forLoopReverse(10);
        ej01.multiTermsForLoop(0);
        ej01.forEachLoop(names);
        ej01.nestedLoops(nums);
        ej01.nestedLoops2(8);
    }
}
