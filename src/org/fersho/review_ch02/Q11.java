/*
 * Q11. What is the output of the following code?
 * a. 0, 0, 5
 * b. 1, 2, 10
 * c. 2, 1, 5
 * d. 2, 0, 5
 * e. 3, 1, 10
 * f. 3, 2, 6
 * g. The code does not compile.
 * A11: d.
 */
package org.fersho.review_ch02;

public class Q11 {

    public static void main(String[] args) {
        int sample1 = (2 * 4) % 3; // 2
        int sample2 = 3 * 2 % 3; // 0
        int sample3 = 5 * (1 % 2); // 5
        System.out.println(sample1 + ", " + sample2 + ", " + sample3);
    }
}
