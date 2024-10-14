/*
 * Q19. Which of the following will compile when independently inserted in the following code?
 * a. Insert al line 6: value1 = "green";
 * b. Insert al line 6: value2 = "purple";
 * c. Insert al line 6: value3 = "orange";
 * d. Insert al line 9: value1 = "magenta";
 * e. Insert al line 9: value2 = "cyan";
 * f. Insert al line 9: value3 = "turquoise";
 * 
 * A19: b, c, e. 
 */
package org.fersho.review_ch05.q19;

public class Order3 {
    final String value1 = "red";
    static String value2 = "blue";
    String value3 = "yellow";
    {

    }

    static {

    }
}
