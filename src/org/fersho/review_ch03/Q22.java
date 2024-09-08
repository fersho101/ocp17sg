/*
 * What is output of the following code snippet?
 * a. 3
 * b. 5 1
 * c. 5 2
 * d. 3 5 1
 * e. 5 2 1
 * f. the code will not compile because of lines 3-5.
 * g. the code will not compile because of line 6.
 * A22: e.
 */
package org.fersho.review_ch03;

public class Q22 {

    public static void main(String[] args) {
        var tailFeathers = 3;
        final var one = 1;
        switch (tailFeathers) {
            case one:
                System.out.print(3 + " ");
            default:
            case 3:
                System.out.print(5 + " ");
        }
        while (tailFeathers > 1) {
            System.out.print(--tailFeathers + " ");
        }
    }
}
