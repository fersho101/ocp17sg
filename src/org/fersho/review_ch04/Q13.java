/*
 * Q13. What is the result of the following code?
 * a. roar roar
 * b. roar roar!!
 * c. roar!!! roar
 * d. roar!!!roar!!!
 * e. Am exception is thrown.
 * f. The code does not compile.
 */
package org.fersho.review_ch04;

public class Q13 {

    public void roar(String roar1, StringBuilder roar2) {
        roar1.concat("!!!");
        roar2.append("!!!");
    }
    public static void main(String[] args) {
        var roar1 = "roar";
        var roar2 = new StringBuilder("roar");

        new Q13().roar(roar1, roar2);
        System.out.println(roar1 + " " + roar2); // roar roar!!!
    }

}
