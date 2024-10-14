/*
 * Q17. What is the result of the following program?
 * a. -1
 * b. 9
 * c. 81
 * d. Compiler error on line 9.
 * e. Compiler error on a diofferent line.
 * 
 * A17: b.
 */
package org.fersho.review_ch05.q17;

public class Squares {
    public static long square(int x) {
        var y = x * (long) x;
        x = -1;
        return y;
    }

    public static void main(String[] args) {
        var value = 9;
        var result = square(value);
        System.out.println(value);
    }
}
