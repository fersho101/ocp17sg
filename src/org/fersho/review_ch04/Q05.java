/*
 * Q05. What is the result of the following code?
 * a. abbaaccc
 * b. abbaccca
 * c. bbaaaccc
 * d. bbaaccca
 * e. An empty line.
 * f. The code does not compile.
 * A05: b.
 */
package org.fersho.review_ch04;

public class Q05 {

    public static void main(String[] args) {
        var sb = new StringBuilder();
        sb.append("aaa").insert(1, "bb").insert(4, "ccc");
        System.out.println(sb); // abbaccca
    }

}
