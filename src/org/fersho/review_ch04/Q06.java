/*
 * Q06. How many of this lines contains a compiler error?
 * a. 0
 * b. 1
 * c. 2
 * d. 3
 * e. 4
 * A06:  c.
 */
package org.fersho.review_ch04;

import java.util.Arrays;

public class Q06 {
    public static void main(String[] args) {

        /*
         * double one = Math.pow(1, 2);
         * int two = Math.round(1.0); 
         * float three = Math.random(); 
         * var doubles = new double[] {one, two, three};
         */

        double one = Math.pow(1, 2);
        int two = (int) Math.round(1.0); // cast to compile, return a long
        float three = (float) Math.random(); // cast to compile, return a double
        var doubles = new double[] { one, two, three };

        System.out.println(Arrays.toString(doubles));
    }
}
