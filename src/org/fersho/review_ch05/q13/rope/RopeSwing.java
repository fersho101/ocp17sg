/*
 * Q13. What is the output of the following code?
 * a. 02
 * b. 08
 * c. 2
 * d. 8
 * e. The code does not compile.
 * f. An exception is thrown.
 * 
 * A13: d.
 */
package org.fersho.review_ch05.q13.rope;

import org.fersho.review_ch05.q13.rope.*;
import static org.fersho.review_ch05.q13.rope.Rope.*;

public class RopeSwing {
    private static Rope rope1 = new Rope();
    private static Rope rope2 = new Rope();

    {
        System.out.println(rope1.length); //This, never runs. RopeSwing is not instantiatedin main.
    }

    public static void main(String[] args) {
        rope1.length = 2; // length 2
        rope2.length = 8; // same length equals 8, because is static.
        System.out.println(rope1.length);
    }

}
