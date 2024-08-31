/*
 * Q12. What is the result of the following snippet?
 * a.11
 * b.13
 * c.23
 * d.33
 * e.50
 * f. The code will no compile because of line 7().
 * A12: c.
 */
package org.fersho.review_ch03;

public class Q12 {
    public static void main(String[] args) {

        int sing = 8, squawk = 2, notes = 0;
        while (sing > squawk) {
            sing--;
            squawk += 2;
            notes += sing + squawk;
        }
        System.out.println(notes);
    }

}
