/*
 * Q05. What is the output?
 * a. It compile and runs without issue but does not produce any output.
 * b. 10, 14,
 * c. 10, 10, 14,
 * d. 10, 10, 14, 10, 14,
 * e. Exactly one line of code does not compile.
 * f. Exactly two line of code does not compile. 
 * g. Three or more lines of code do not compile.
 * h. The code contains an infinite loop and does not terminate.
 * A05: e. 
 * Note: error, the continue on line 31, cause an unreachable statement.
 */
package org.fersho.review_ch03;

import java.util.List;
import java.util.ArrayList;

public class Q05 {
    public static void main(String[] args) {
        List<Integer> myFavoriteNumbers = new ArrayList<>();
        myFavoriteNumbers.add(10);
        myFavoriteNumbers.add(14);

        for (var a : myFavoriteNumbers) {
            System.out.print(a + " ");
            break;
        }

        for (int b : myFavoriteNumbers) {
            // continue;
            System.out.print(b + ", ");
        }

        for (Object c : myFavoriteNumbers) {
            System.out.print(c + ", ");
        }
    }
}
