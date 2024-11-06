package org.fersho.review_ch06.q04;

/*
 * Q04. What is the output of the following program?
 * a. Platypus
 * b. Mammal 
 * c. PlatypusMammal
 * d. MammalPlatypus
 * e. The code will compile if line 7 is changed.
 * f. The code will compile if line 9 is changed.
 * 
 * A04. f.
 */

public class Platypus extends Mammal {

    // line 7
    int sneeze() {
        return 1;
    }

    public Platypus() {
        // Line 9
        super(0); // this line was added to compile
        System.out.print("Platypus");
    }

    public static void main(String[] args) {
        new Mammal(5);
    }
}
