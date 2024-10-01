package org.fersho.lectures.ch05_methods.passing_data;

public class Swap {
    public static void main(String[] args) {
        int o1 = 1;
        int o2 = 2;
        swap(o1, 02);

        System.out.println("o1 = " + o1);
        System.out.println("o2 = " + o2);
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
