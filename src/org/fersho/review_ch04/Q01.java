/*
 * Q01. What is the output by the following code?
 * a. 4 1
 * b. 5
 * c. 5 true
 * d. 5tuna
 * e. 51tuna
 * f. The code does not compile.
 * A01: f.
 */
package org.fersho.review_ch04;

public class Q01 {

    public static void main(String[] args) {
        // original
        /*
         * int numFish = 4;
         * String fishType = "tuna";
         * String anotherFish = numFish + 1; 
         * System.out.println(anotherFish + " " + fishType);
         * System.out.println(numFish + " " + 1);
         */
        int numFish = 4;
        String fishType = "tuna";
        String anotherFish = numFish + 1 + ""; // Fixed adding "" to compile.
        System.out.println(anotherFish + " " + fishType); //5 tuna
        System.out.println(numFish + " " + 1); // 4 1
    }

}
