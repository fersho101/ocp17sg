/*
 * Q10. What are the output of the following code snippet?
 * a. 1
 * b. 2
 * c. 3
 * d. 4
 * e. 5
 * f. 6
 * g. The code does not compile.
 * A10: g.
 */
package org.fersho.review_ch02;

public class Q10 {
    public static void main(String[] args) {
        /*
         * Original 
         * short zebra = (byte)weight * (byte)height;         * 
         */
        short height = 1, weight = 3;
        short zebra = (byte) (weight * height); // fixed
        double ox = 1 + height * 2 + weight;
        long giraffe = 1 + 9 % height + 1;
        System.out.println(zebra);
        System.out.println(ox);
        System.out.println(giraffe);
    }

}
