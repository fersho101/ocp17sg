/*
 * Q19. What is the result of executing the following code snippet?
 * a. start is 0.
 * b. start is -128.
 * c. start is 127.
 * d. end is 8.
 * e. end is 11.
 * f. end is 12.
 * g. The code does not compile.
 * h. The code compiles but throws an exception at runtime.
 * A19: b, f.
 */
package org.fersho.review_ch02;

public class Q19 {

    public static void main(String[] args) {
        int start = 7;
        int end = 4;
        end += ++start;
        start = (byte) (Byte.MAX_VALUE + 1);

        System.out.println("start: " + start);
        System.out.println("end: " + end);
    }
}
