/*
 * Q14. How many lines in the following code have comiler error?}
 * a. 0
 * b. 1
 * c. 2
 * d. 3
 * e. 4
 * f. 5
 * 
 * A14: e.
 */
package org.fersho.review_ch05.q14;

public class RopeSwing {
    private static final String leftRope;
    private static final String rightRope;
    // private static final String bench;
    private static final String name = "name";
    static {
        leftRope = "left";
        rightRope = "right";
    }
    static {
        // name = "name";
        // rigthRope = "rigth";
    }

    public static void main(String[] args) {
        // bench = "beach";
    }
}
