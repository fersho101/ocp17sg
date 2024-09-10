/*
 * Q13. What is the output of the following code snippet?
 * a. true-false-false
 * b. false-true-false
 * c. true-true-true
 * d. false-true-true
 * e. false-false-false
 * f. true-true-false
 * g. None of the above.
 * A13: f.
 */
package org.fersho.review_ch02;

public class Q13 {
    public static void main(String[] args) {
        boolean sunny = true, raining = false, sunday = true;
        boolean goingToTheStore = sunny && raining ^ sunday; // true
        boolean goingToTheZoo = sunday && !raining; // true
        boolean stayinHome = !(goingToTheStore && goingToTheZoo); // false
        System.out.println(goingToTheStore + "-" + goingToTheZoo + "-" + stayinHome);
    }

}
