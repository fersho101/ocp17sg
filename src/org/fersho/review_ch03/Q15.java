/*
 * Q15. What is the result of the following code snippet?
 * a. great
 * b. great good
 * c. good
 * d. not good
 * e. the code does not compile because the data type of one or more case statement does not match the data typeof the swit ch variable.
 * f. None of the above.
 * A15: f. fixing line 22 by adding "case" to option C will print great good.
 */
package org.fersho.review_ch03;

public class Q15 {

    public static void main(String[] args) {
        final char a = 'A', e = 'E';
        char grade = 'B';

        switch (grade) {
            default:
            case a:
            case 'B': case 'C': System.out.print("great "); // option C was fixed with "case" to compile.
            case 'D': System.out.print("good "); break;
            case e: // compile, but the type is wrong
            case 'F':
                System.out.println("Not good");
        }
    }

}
