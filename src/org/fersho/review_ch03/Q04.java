/*
 * Q04. What is the output of calling printReptile(6)?
 * a. Snake
 * b. Lizard
 * c. Turtle
 * d. Alligator
 * e. TurtleAlligator
 * f. None of above.
 * A04: f. Does not compile. Switch expression requires all possible case values to be handled.
 * Note: 
 */
package org.fersho.review_ch03;

public class Q04 {

     static void printReptile(int category) {
        var type = switch(category) {
            case 1, 2 ->  "Snake";
            case 3, 4 -> "Lizard";
            case 5, 6 -> "Turtle";
            case 7, 8 -> "Alligator";
            default -> "None of the above"; // this was added to compile
        };
        System.out.println(type);
    }

    public static void main(String[] args) {
               
        int n = 6;
        printReptile(n);
    }

}
