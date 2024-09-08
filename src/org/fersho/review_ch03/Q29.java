/*
 * Q29. What is the result of the following code?
 * a. -2 -1 0 1 2 3 4 5
 * b. -2 -1 0 1 2 3 4 
 * c. -1 0 1 2 3 4 5 6
 * d. -1 0 1 2 3 4 5
 * e. The code will not compile because of line 5.
 * f. The code contains infinite loop and does not terminate.
 * A29: c.
 */ 
package org.fersho.review_ch03;

public class Q29 {
    public static void main(String[] args) {
        int y = -2;
        do System.out.print(++y + " ");
        while (y <= 5);
    }

}
