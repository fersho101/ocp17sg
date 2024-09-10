/*
 * Q09. What are the unique outputs of the following code snippet?
 * a. 1
 * b. 2
 * c. 3
 * d. 4
 * e. 5
 * f. 6
 * g. the code does not compile.
 * A09: a, d, e. 
 */
package org.fersho.review_ch02;

public class Q09 {
    public static void main(String[] args) {
        int a = 2, b = 4, c = 2;
        System.out.println(a > 2 ? --c : b++);
        System.out.println(b = (a!=c ? a : b++));
        System.out.println(a > b ? b < c ? b : 2 : 1);        
    }
    
}
