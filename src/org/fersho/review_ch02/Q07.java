/*
 * Q07. What is the output of the following code snippet?
 * a. true-true-true
 * b. true-true-false
 * c. true-false-true
 * d. true-false-false
 * e. false-true-true
 * f. false-true-false
 * g. false-false-true
 * h. false-false-false
 * A07: d.
 */
package org.fersho.review_ch02;

public class Q07 {

    public static void main(String[] args) {
        int ph = 7, vis = 2;
        boolean clear = vis > 1 & (vis < 9 || ph < 2);
        boolean safe = (vis > 2) && (ph++ > 1);
        boolean tasty = 7 <= --ph;
        System.out.println(clear + "-" + safe + "-" + tasty); 
    }

}
