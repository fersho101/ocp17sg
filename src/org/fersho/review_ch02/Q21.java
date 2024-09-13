/*
 * Q21. What is the result of executing the following code snipped?
 * a. -7,-8,9
 * b. -7, -8, 10
 * c. -8,-8, 4
 * d. -8,-8, 5
 * e. -9, -8, 9
 * f.-9, -8, 10
 * g. None of the above.
 * A21: c.
 */
package org.fersho.review_ch02;

public class Q21 {

    public static void main(String[] args) {
        int myFavoriteNumber = 8; 
        int bird = ~myFavoriteNumber; // -9
        int plane = -myFavoriteNumber; // -8
        var superman = bird == plane ? 5 : 10; // 10
        System.out.println(bird + ", " + plane + ", " + --superman);
    }

}
