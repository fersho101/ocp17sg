package org.fersho.lectures.ch04_core_apis;

import java.util.Arrays;

public class ComparingArrays {
    public static void main(String[] ars) {

        System.out.println(Arrays.compare(new int[] { 1 }, new int[] { 5 })); // -1, first array is smaller

        //Arrays.compare() some examples 

        System.out.println(Arrays.compare(new int[] { 1, 2 }, new int[] { 1})); // 1, first array is longer
        System.out.println(Arrays.compare(new int[] { 1, 2 }, new int[] { 1, 2 })); // 0, exact match
        System.out.println(Arrays.compare(new String[] { "a" }, new String[] { "aa" })); // -1, first element is a substring of the second
        System.out.println(Arrays.compare(new String[] { "a" }, new String[] { "A" })); // 32, uppercase is smaller than lowercase
        System.out.println(Arrays.compare(new String[] { "a" }, new String[] { null })); // 1, null is smaller than a letter
        System.out.println("\n");

        //mismatch();
        System.out.println(Arrays.mismatch(new int[]{1}, new int[]{1})); //-1, are equals
        System.out.println(Arrays.mismatch(new String[]{"a"}, new String[]{"A"})); // 0, first index where the arrs differ
        System.out.println(Arrays.mismatch(new int[]{1,2}, new int[]{1})); // -1, first index where theyt differ
    }
}
