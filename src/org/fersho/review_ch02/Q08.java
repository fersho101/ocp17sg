/*
 * Q08. What is the output of the following code smippet?
 * a. 4 - 1
 * b. 4 - 2
 * c. 5 - 1
 * d. 5 - 2
 * e. The code does not compile due to line 7.
 * f. None of the above.
 * A08: a.
 */
package org.fersho.review_ch02;

public class Q08 {
    public static void main(String[] args) {
        int pig = (short) 4;
        pig = pig++;
        long goat = (int) 2;
        goat -= 1.0;
        System.out.println(pig + " - " + goat);
    }
}
