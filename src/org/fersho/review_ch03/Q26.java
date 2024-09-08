/*
 * Q26. What is the output of the following code snippet?
 * a. ABC
 * b. ABCABC
 * c. ABCABCABC
 * d. Line 15 contains a compilation error.
 * e. Line 18 contains a compilation error.
 * f. The code compiles but never terminates at runtime.
 * g. The code compiles but throws a NullPointerException at runtime.
 * A26: f.
 */
package org.fersho.review_ch03;

public class Q26 {

    public static void main(String[] a) {
        int w = 0, r = 1;
        String name = "";
        while (w < 2) {
            name += "A";
            do {
                name += "B";
                if (name.length() > 0)
                    name += "C";
                else
                    break;
            } while (r <= 1);
            r++;
            w++;
        }
        System.out.println(name);
    }

}
