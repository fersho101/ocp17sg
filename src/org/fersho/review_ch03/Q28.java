/*
 * Q28. What is the output of calling getFish("goldie")?
 * a. Eat!
 * b. Swim!
 * c. Eat! followed by and exception.
 * d. Eat! Swim!
 * e. An exception is printed.
 * f. None of the above.
 * A28: f. guppy is duplicated and the code doesn't compile.
 */
package org.fersho.review_ch03;

public class Q28 {

    void getFish(Object fish) {
        if (!(fish instanceof String guppy))
            System.out.println("Eat!");
        else if (!(fish instanceof String guppy2)) { //Changed to compile
            throw new RuntimeException();
        }
        System.out.println("Swim");
    }

    public static void main(String args[]) {
        Q28 q28 = new Q28();
            q28.getFish("goldie");
    }
}
