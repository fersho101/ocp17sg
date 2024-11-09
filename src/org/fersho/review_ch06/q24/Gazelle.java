package org.fersho.review_ch06.q24;
/*
 * Q24. What is printed by the following program?
 * a. 182640
 * b. 182943
 * c. 182493
 * d. 421389
 * e. The code does not copile.
 * f. The output cannot be determined until runtime.
 * 
 * A24: c.
 */

class Antelope {
    public Antelope(int p) {
        System.out.print("4");
    }

    {
        System.out.print("2");
    }
    static {
        System.out.print("1");
    }
}

public class Gazelle extends Antelope {
    public Gazelle(int p) {
        super(6);
        System.out.print("3");
    }

    public static void main(String hopping[]) {
        new Gazelle(0);
    }

    static {
        System.out.print("8");
    }
    {
        System.out.print("9");
    }
}
