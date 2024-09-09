/*
 * Q04. What is the output of the following code snippet?
 * a) true, 20, true
 * b) true, 20, false
 * c) false, 10, true
 * c) false, 20, false
 * e) The code will not compile because of line 5.
 * f) None  of the above.
 * A04: b.
 */
package org.fersho.review_ch02;

public class Q04 {
    public static void main(String[] args) {
       boolean canine = true, wolf = true;
       int teeth = 20;
       canine = (teeth != 10) ^ (wolf = false);
       System.out.println(canine + ", " + teeth + ", " + wolf);        
        
    }

}
