/*
 * Q12. What is output by the following code?
 * a. 12
 * b. 123
 * c. 7
 * d. 78
 * e. A blank line
 * f. The code does not compile.
 * g. An exception is thrown.
 * 
 * A12: a, d, e. 
 */
package org.fersho.review_ch04;

public class Q12 {
    public static void main(String[] args) {
        var numbers = "012345678".indent(1);
        System.out.println(numbers); // " 012345678"
        numbers = numbers.stripLeading(); // remove indent of 1
        System.out.println(numbers); // "012345678"
        System.out.println(numbers.substring(1, 3)); // "12"
        System.out.println(numbers.substring(7, 7)); // ""
        System.out.println(numbers.substring(7)); // "78"
    }

}
