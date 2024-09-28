/*
 * Q15. What is the output of the following?
 * a. [pig, PIG, 123]
 * b. [PIG, pig, 123]
 * c. [123, pig, PIG]
 * d. [123, pig, PIG]
 * e. -3
 * f. -2
 * g. The result of a binarySearch() are undefined in this example.
 * 
 * A15: c, e.
 */
package org.fersho.review_ch04;

import java.util.Arrays;

public class Q15 {
    public static void main(String[] args) {
        var arr = new String[] { "PIG", "pig", "123" };
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, "Pippa"));
    }
}
