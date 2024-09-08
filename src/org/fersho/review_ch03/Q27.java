/*
 * Q27. What is printed by the following code snipped?
 * a. Red
 * b. Green.
 * c. Purple.
 * d. RedPurple
 * e. An exception is thrown at runtime.
 * f. the code does not compile.
 * A27: f. 
 */
package org.fersho.review_ch03;

public class Q27 {

    public static void main(String[] args) {
        // Original snippet
        /*
         * byte amphibian = 1;
         * String name = "Frog";
         * String color = switch (amphibian) {
            * case 1 -> {
                * yield "Red";
            * }
         * case 2 -> {
             * if (name.equals("Frog"))
                * yield "Green";
            * else
                * yield "Blue";
            * }
         * case 3 -> {
            * yield "Purple";
            * }
         * 
            * default -> throw new RuntimeException("Error");
         * };
         * System.out.println(color);
         */

        byte amphibian = 1;
        String name = "Frog";
        String color = switch (amphibian) {
            case 1 -> {
                yield "Red";
            }
            case 2 -> {
                if (name.equals("Frog"))
                    yield "Green";
                else
                    yield "Blue"; //added to compile
            }
            case 3 -> {
                yield "Purple";
            }

            default -> throw new RuntimeException("Error"); //added to compile
        };
        System.out.println(color);
    }
}
