/*
 * Q09. Which statement, when inserted independently into the following blank, will cause the code to print 2 at runtime?
 * a. break BUNNY
 * b. break RABBIT
 * c. continue BUNNY
 * d. continue RABBIT
 * e. break
 * f. continue
 * g. None of the above, as the code contains a compiler error. 
 * A09: b, c, e.
 */
package org.fersho.review_ch03;

public class Q09 {
    public static void main(String[] args) {
        int count = 0;
        BUNNY: for (int row = 1; row <= 3; row++) {
            RABBIT: for (int col = 0; col < 3; col++) {
                if ((col + row) % 2 == 0) {
                    break;
                }
                count++;
            }
        }
        System.out.println(count);
    }

}
