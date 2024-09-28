/*
 * Q17. Which of this statements are true? 
 * A17: a, g.
 */
package org.fersho.review_ch04;

public class Q17 {
    public static void main(String[] args) {
        var letters = new StringBuilder("abcdefg");
        // a. returns a single-character String.
        System.out.println(letters.substring(1, 2)); // b, true

        // b. returns a single-character String.
        System.out.println(letters.substring(2, 2)); // , false

        // c. returns a single-character String.
        // System.out.println(letters.substring(6, 5)); // false, throws an exception

        // d. returns a single-character String.
        System.out.println(letters.substring(6, 6)); // false

        // e. throws an exception.
        System.out.println(letters.substring(1, 2)); // b, false

        // f. throws an exception.
        System.out.println(letters.substring(2, 2)); //  false

        // g. throws an exception.
        // System.out.println(letters.substring(6, 5)); // true, throws an exception

        // h. throws an exception.
        System.out.println(letters.substring(6, 6)); // false       

    }

}
