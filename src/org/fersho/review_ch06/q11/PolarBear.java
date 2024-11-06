package org.fersho.review_ch06.q11;

/*
 * Q11. What is the result of the following?
 * a. tacb
 * b. tacf
 * c. tacbf
 * d. tcafb
 * e. taftacb
 * f. The code does not compile.
 * g. An exceptionis thrown.
 * 
 * A11: 
 */

public class PolarBear {
    StringBuilder value = new StringBuilder("t");
    {
        value.append("a");
    }
    {
        value.append("c");
    }

    private PolarBear() {
        value.append("b");
    }

    public PolarBear(String s) {
        this();
        value.append(s);
    }

    public PolarBear(CharSequence p) {
        value.append(p);
    }

    public static void main(String[] args) {
        Object bear = new PolarBear(); // tac b
        bear = new PolarBear("f"); // tac b f
        System.out.println(((PolarBear) bear).value);
    }

}
