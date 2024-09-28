/*
 * Q19. Which of the following fill the blank to print a positive integer?
 * a. compare(s1, s2)
 * b. mismatch(s1, s2)
 * c. compare(s3, s4)
 * d. mismatch(s3, s4)
 * e. compare(s4, s4)
 * f. mismatch(s4, s4)
 * 
 * A19: a, b, d
 */
package org.fersho.review_ch04;

import java.util.Arrays;

public class Q19 {

    public static void main(String[] args) {
        String[] s1 = { "Camel", "Peacock", "Llama" };
        String[] s2 = { "Camel", "Llama", "Peacock" };
        String[] s3 = { "Camel" };
        String[] s4 = { "Camel", null };
        System.out.println(Arrays.compare(s1, s2)); // 4, s1 is larger
        System.out.println(Arrays.mismatch(s1, s2)); // 1, arrays have the first difference at index 1.
        System.out.println(Arrays.compare(s3, s4)); // -1
        System.out.println(Arrays.mismatch(s3, s4)); // 1, arrays have the first difference at index 1.
        System.out.println(Arrays.compare(s4, s4)); // 0
        System.out.println(Arrays.mismatch(s4, s4)); // -1
    }

}
