package org.fersho.review_ch06.q16;

/*
 * Q16. What is the result of the following?
 * a. qu qu qumrcrc
 * b. u u ucrcrm
 * c. uq uq uqmcrcr
 * d. uq uq uqcrcrm
 * e. qu qu qumcrcr
 * f. qu qu qucrcrm
 * g. The code does not compile.
 * 
 * A16: d.
 */

public class Scorpion extends Arachnid {
    static {
        sb.append("q");
    }
    {
        sb.append("m");
    }

    public static void main(String[] args) {
        System.out.print(Scorpion.sb + " ");
        System.out.print(Scorpion.sb + " ");
        new Scorpion();
        new Arachnid();
        System.out.print(Scorpion.sb);
    }

}
