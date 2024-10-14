/*
 * Q21. Which method signature are valid overloads of the following method signature?
 * public void moo(int m, int... n)
 * a. public void moo(int a, int...n)
 * b. public int moo(char ch)
 * c. public void mooooo(int ... z)
 * d. private void moo(int ... z)
 * e. public void moooo(int y)
 * f. public void moo(int...c, int d)
 * g. public void moo(int...i, int j)
 * 
 * A21: b, d
 */
package org.fersho.review_ch05;

public class Q21 {
    // a
    // public void moo(int m, int... b) {} //Not compile, same as the original

    // b
    // public int moo(char ch) {} // OK

    // c
    public void mooooo(int... z) {
    } // Different signature

    // d
    private void moo(int... z) {
    } // OK

    // e
    public void moooo(int y) {
    } // Differnete signature

    // d
    // public void moo(int... c, int d) {} // Does not compile, varargs wrong place

    // public void moo(int... i, int j...) {} // Does not compile, varargs wrong
    // place and more than one.
}
