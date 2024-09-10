/*
 * Q06. What is the output of the following program?
 * a. 4, 6, 6.0
 * b. 3, 5, 6
 * c. 3, 6, 6
 * d. 4, 5, 6
 * e. The code does not compile because of line 9(30).
 * f. None of the above.
 * A06:  f. Not compile because the cast is applied to fruit only.
 * 
 */
package org.fersho.review_ch02;

public class Q06 {
    // Original
    /*
     * static long addCandy(double fruit, float vegetables) {
     *   return (int) fruit + vegetables;
     * }
     */

    // fixed
    static long addCandy(double fruit, float vegetables) {
        return (int) (fruit + vegetables); // fixed to compile.
    }

    public static void main(String[] ar) {
        System.out.println(addCandy(1.4, 2.4f) + ", ");
        System.out.println(addCandy(1.9, (float) 4) + ", ");
        System.out.println(addCandy((long) (int) (short) 2, (float) 4));
    }
}
