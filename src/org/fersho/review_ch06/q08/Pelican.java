package org.fersho.review_ch06.q08;
/*
 * Q08. What is the result of the following code?
 * a. Oh-Bird
 * b. Oh-Pelican
 * c.Wow-Oh-Bird
 * d. Wow-Oh-Pelican
 * e. The code contains a compilation error.
 * f. None of the above.
 * 
 * A08: d.
 */

public class Pelican extends Bird {
    public Pelican() {
        System.out.print("Oh-");
    }

    protected void fly() {
        System.out.print("Pelican");
    }

    public static void main(String[] args) {
        var chirp = new Pelican();
        chirp.fly();
    }

}
