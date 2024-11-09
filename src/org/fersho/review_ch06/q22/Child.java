package org.fersho.review_ch06.q22;
/*
 * Q22. What does the following program print?
 * a. Elysia Sophia
 * b. Webby Olivia
 * c. Olivia Olivia
 * d. Olivia Sophia
 * e. The code does not compile.
 * f. None of the above.
 * 
 * A22: d.
 */

class Person {
    static String name;

    void setName(String q) {
        name = q;
    }
}

public class Child extends Person {
    static String name;

    void setName(String w) {
        name = w;
    }

    public static void main(String[] p) {
        final Child m = new Child();
        final Person t = m;
        m.name = "Elisya";
        t.name = "Sophia";
        m.setName("Webby");
        t.setName("Olivia");
        System.out.println(m.name + " " + t.name);

    }
}
