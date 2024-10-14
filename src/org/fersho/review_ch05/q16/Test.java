/*
 * Q16. What is the result of the following staements?
 * a. byte-float-Object-
 * b. int-float-Object-
 * c. byte-Object-float-
 * d. int-Object-float-
 * e. int-Object-Object-
 * f. byte-Object-Object-
 * 
 * A16: e.
 */
package org.fersho.review_ch05.q16;

public class Test {

    public void print(byte x) {
        System.out.println("byte-");
    }

    public void print(int x) {
        System.out.println("int-");
    }

    public void print(float x) {
        System.out.println("float-");
    }

    public void print(Object x) {
        System.out.println("Object-");
    }

    public static void main(String[] args) {
        Test t = new Test();
        short s = 123;

        t.print(s);
        t.print(true);
        t.print(6.789);
    }

}
