/*
 * Q18. What is the result of the following code?
 * a. 2
 * b. 4
 * c. 7
 * d. 10
 * e. ==
 * f. equals
 * g. An exception is thrown.
 * h. The code doesn't compile.
 * 
 * A18: c, f.
 */

package org.fersho.review_ch04;

public class Q18 {

    public static void main(String[] args) {
        String s1 = """
                purr""";
        String s2 = "";
        s1.toUpperCase();
        s1.trim();
        s1.substring(1, 3);
        s1 += "two";

        s2 += 2;
        s2 += 'c';
        s2 += false;

        if (s2 == "2cfalse")
            System.out.println("==");
        if (s2.equals("2cfalse"))
            System.out.println("equals");
        System.out.println(s1.length());
    }

}
