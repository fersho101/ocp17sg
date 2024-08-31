/*
 * Q13. What is the output of the following code snippet?
 * a. 7
 * b.9
 * c. 10
 * d. 11
 * e. 15
 * f. The code will not compile because of the line 6.
 * g. the code does not compile for a different reason.
 * A13: g. missing parenthess the while statement line 24.
 */
package org.fersho.review_ch03;

public class Q13 {

    public static void main(String[] args) {
        boolean keepGoing = true;
        int result = 15, meters = 10;

        do {
            meters--;
            if (meters == 8)
                keepGoing = false;
            result -= 2;
        } while (keepGoing); // addin parenthesis to compile.
        System.out.println(result);
    }

}
