/*
 * Q19. What is the output of the following code snippet?
 * a. 1 2 3 4 -4.0
 * b. 1 2 3 4 -5.0
 * c. 1 2 3 4 5 -4.0
 * d. 0 1 2 3 4 5 -5.0
 * e. The codedoes not compile.
 * f. The code compiles but produce an infinite loop at runtime.
 * g. None of the above.
 * A19; e. Varible snake is out of range.
 * Note: The variable snakeAux was added, to compile.
 */
package org.fersho.review_ch03;

public class Q19 {

    public static void main(String[] args) {
        double iguana = 0, snakeAux = 0;
        do {
            int snake = 1;
            System.out.print(snake++ + " ");
            iguana--;
        } while(/*snake*/ snakeAux  <= 5);
        System.out.println(iguana);
    }
}
