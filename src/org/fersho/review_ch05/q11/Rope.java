/*
 * Q11. Which statement are true of the following code?
 * a. The code compiles as is.
 * b. There is exactly one compiler error in the code.
 * c. There is exactly two compiler errors in the code.
 * d. if the line with the compiler errors are removed the output is swing-climp.
 * e. if the line with the compiler errors are removed the output is swing-swing.
 * f. if the line with the compiler errors are removed, the code throws a NullPointerException.
 * 
 * A11: b, e.
 */
package org.fersho.review_ch05.q11;

public class Rope {
    public static void swing() {
        System.out.print("swing");
    }

    public void climb() {
        System.out.print("climb");
    }

    public static void play() {
        swing();
        // climb(); // static method cannot call instance method
    }

    public static void main(String[] args) {
        Rope rope = new Rope();
        rope.play(); // swing
        Rope rope2 = null;
        System.out.print("-");  // -
        rope2.play(); // swing
    }
}
