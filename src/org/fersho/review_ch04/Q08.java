/*
 * Q08. Which of the following return 5 when run independently?
 * a. builder.charAt(4)
 * b. builder.replace(2, 4, "6").charAt(3)
 * c. builder.replace(2, 5, "6").charAt(2)
 * d. string.charAt(5)
 * e. string.length
 * f. string.replace("123", "1").charAt(2)
 * d. None of above.
 * 
 * A08: a, b, f.
 */
package org.fersho.review_ch04;

public class Q08 {

    public static void main(String[] args) {
        var string = "12345";
        var builder = new StringBuilder("12345");

        System.out.println(builder.charAt(4)); // 5
        System.out.println(builder.replace(2, 4, "6").charAt(3)); // 5
        System.out.println(builder.replace(2, 5, "6").charAt(2)); // 6
        //System.out.println(string.charAt(5)); // Does not compile, out of index
        //System.out.println(string.length); // Does not compile, missing parenthesis
        System.out.println(string.replace("123", "1").charAt(2)); // 5
        
    }

}
