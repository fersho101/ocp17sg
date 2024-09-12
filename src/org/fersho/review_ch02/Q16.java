/*
 * Q16. How many lines of the following code contains errors?
 * a. 0
 * b. 1
 * c. 2.
 * d. 3
 * e. 4
 * A16: b.
 */
package org.fersho.review_ch02;

public class Q16 {

    public static void main(String[] args) {
        // int note = 1 * 2 + (long)3; //original
        long note = 1 * 2 + (long)3; //fixed
        short melody = (byte)(double)(note *= 2);
        double song = melody;
        float symphony = (float)((song == 1_000f) ? song * 2L : song);
    }

}
