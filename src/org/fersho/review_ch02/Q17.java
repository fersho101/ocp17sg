/*
 * Q17. Given the following code snipped, what are the values of the variables after it is executed?
 * a. ticketsSold is 8.
 * b. ticketsTaken is 2.
 * c. ticketsSold is 6.
 * d. ticketsTaken is 6.
 * e. ticketsSold is 7.
 * f. ticketsTaken is 4.
 * g. The code does not compile.
 * A17:  c, f.  
*/

package org.fersho.review_ch02;

public class Q17 {

    public static void main(String[] args) {
        int ticketsTaken = 1;
        int ticketsSold = 3;
        ticketsSold += 1 + ticketsTaken++;
        ticketsTaken *= 2;
        ticketsSold += (long) 1;
    }
}
