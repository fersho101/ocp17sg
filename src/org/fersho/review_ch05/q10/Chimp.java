/*
 * Q10. What is the output of executing the Chimp program?
 * a. swing swing 5
 * b. swing swing 10
 * c. Compiler error on line 2 of Chimp
 * d. Compiler error on line 5 of Chimp
 * e. Compiler error on line 6 of Chimp
 * f. Compiler error on line 7 of Chimp
 */
package org.fersho.review_ch05.q10;

import org.fersho.review_ch05.q10.rope.*;
import static org.fersho.review_ch05.q10.rope.Rope.*;

public class Chimp {
    public static void main(String[] args) {
        Rope.swing();
        new Rope().swing();
        System.out.println(LENGTH);
    }
}
