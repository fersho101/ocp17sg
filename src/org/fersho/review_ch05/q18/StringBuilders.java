/*
 * Q18. Which is the following are output by the following code?
 * a. s1 = a
 * b. s1 = s1
 * c. s2 = s2 
 * d. s2 = s2b
 * e. s3 = a
 * f. The code does not compíle.
 * A18: b, d, e.   
 */
package org.fersho.review_ch05.q18;

public class StringBuilders {
    public static StringBuilder work(StringBuilder a, StringBuilder b) {
        a = new StringBuilder("a");
        b.append("b");
        return a;
    }

    public static void main(String[] args) {
        var s1 = new StringBuilder("s1");
        var s2 = new StringBuilder("s2");
        var s3 = work(s1, s2);
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
    }
}
