/*
 * Q12. How many variables in the following method are effectively final?
 * a. 1
 * b. 2
 * c. 3
 * d. 4
 * e. 5
 * f. None of the above. The code does not compile.
 * 
 * A12: a. 
 */
package org.fersho.review_ch05;

public class Q12 {
    @SuppressWarnings("unused")
    public static void feed() {
        int monkey = 0;
        if (monkey > 0) {
            var giraffe = monkey++;
            String name;
            name = "geoffrey";
        }
        String name = "milly";
        var food = 10;
        while (monkey <= 10) {
            food = 0;
        }
        name = null;
    }
    public static void main(String[] args) {
        feed();
    }
}
