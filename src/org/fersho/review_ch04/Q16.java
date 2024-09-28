/*
 * Q16. What is included in the output of the following code?
 * a. 10
 * b. 11
 * c. 12
 * d. 13
 * e. 14
 * f. 15
 * g. 16
 * 
 * A16: a, b, g.
 */

package org.fersho.review_ch04;

public class Q16 {
    public static void main(String[] args) {

        var base = "ewe\nsheep\\t";       
        int length = base.length(); // 11, /n count as one, // count as one.
        int indent = base.indent(2).length(); // 16, indent adds 2 character on each line, also normalizes by adding a new line at the end.  
        int translate = base.translateEscapes().length();

        var formatted = "%s %s %s".formatted(length, indent, translate);
        System.out.println(formatted);
    }
}
