package org.fersho.review_ch06.q23;

/*
 * Q23. What is the ouput of the following program?
 * a. qpz
 * b. qpzj
 * c. jzpa
 * d. apj
 * e. apjm
 * f. The code does not compile.
 * g. None of the above.
 * 
 * A23. b
 */

public class Fennec extends Fox {
    public Fennec(int e) {
        super("tails");
        print("j");
    }

    public Fennec(short f) {
        super("eevee");
        print("m");
    }

    public static void main(String[] unused) {
        System.out.println(new Fennec(1).view());
    }
}
