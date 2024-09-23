package org.fersho.lectures.ch04_core_apis;

import java.util.Arrays;

public class UnderstandigArrays {

    @SuppressWarnings("unused")
    public static void main(String[] args) {

        // Creating an array of primitives

        int[] numbers = new int[3];

        // Another way

        int[] moreNumbers = new int[] { 1, 2, 3 };
        int[] moreNumbers2 = { 1, 2, 3 };

        // valid statements to declare an an array
        int[] numsanimal;
        int[] numsanimal2;
        int[] numsanimal3;
        int numsanimal4[];
        int numsanimal5[];

        // multiple declarations

        int[] ids, types; // two int arrays
        int ids2, types2; // ine array, one int

        // Creating an array with reference variables

        String[] bugs = { "cricket", "beetle", "ladybug" };
        String[] alias = bugs;

        System.out.println(bugs.equals(alias)); // true
        System.out.println(bugs.toString()); // [Ljava.lang.String;@4517d9a3
        System.out.println(alias.toString()); // [Ljava.lang.String;@4517d9a3

        System.out.println(Arrays.toString(bugs)); // [cricket, beetle, ladybug]

        // allocates reference

        String[] names = new String[2];
        System.out.println(Arrays.toString(names)); // [null, null]

        // length

        String[] mammals = { "monkey", " chimp", "donkey" };
        System.out.println(mammals.length); // 3

        var nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 5;
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        // sorting
        int[] nums2 = { 6, 9, 1 };
        Arrays.sort(nums2);
        System.out.println(Arrays.toString(nums2));

        // another sort
        String[] strs = { "10", "9", "100" };
        Arrays.sort(strs);
        for (String s : strs) {
            System.out.print(s + " ");
        }

    }

}
