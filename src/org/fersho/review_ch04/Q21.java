/*
 * Q21. Which of the following can fill in the blank to print avaJ?
 * a. reverse();
 * b. append("vaJ$").substring(0, 4)
 * c. append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length() - 1)
 * d. append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length())
 * e. None of the above.
 * 
 */
package org.fersho.review_ch04;

public class Q21 {
    public static void main(String[] args) {

        var puzzle = new StringBuilder("Java");
        System.out.println(puzzle);
        // System.out.println(puzzle.reverse()); // avaJ
        // System.out.println(puzzle.append("vaJ$").substring(0, 4)); // avaJ
        // System.out.println(puzzle.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length() - 1)); // avaJ
        // System.out.println(puzzle.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length() )); // thrown exception       

    }
}
