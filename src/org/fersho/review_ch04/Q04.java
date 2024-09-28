/*
 * Q04. Which  of the following are output by this code ?
 * a. one
 * b. two
 * c. three
 * d. four
 * e. five
 * f. the code does not compile.
 * g. None of the above.
 * 
 * A04. a, c, d. 
 */
package org.fersho.review_ch04;

public class Q04 {

    public static void main(String[] args) {
        var s = "Hello";
        var t = new String(s);
        if("Hello".equals(s)) System.out.println("one");
        if (t == s) System.out.println("two");
        if(t.intern() == s) System.out.println("three");
        if("Hello" == s) System.out.println("four");
        if("Hello".intern() == t) System.out.println("five");      
    }

}
