/*
 * Q23. What is the output of the following code snipped?
 * a. Success
 * b. Failure
 * c. Ither
 * d. The code will not compile because line 17.
 * e. The code compile but throws an exception at runtime.
 * f. Node of the above.
 * A23: f.
 * 
 */
package org.fersho.review_ch03;

public class Q23 {
    public static void main(String... a) {
        /*
        * int penguin = 50, turtle = 75;
          boolean older = penguin >= turtle;
          if (older = true)
            System.out.println("Success");
          else
            System.out.println("Failure");
          else if(penguin != 50) 
            System.out.println("Other");
         */
        int penguin = 50, turtle = 75;
        boolean older = penguin >= turtle;
        if (older = true)
            System.out.println("Success");
        else
            System.out.println("Failure");
        if(penguin != 50) //"else" was removed to compile
            System.out.println("Other");
    }

}
