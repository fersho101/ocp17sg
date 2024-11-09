package org.fersho.review_ch06.q20;

/*
 * Q20. Which statement about the following program is correct?
 * a. One line containd a compiler error.
 * b. Two lines contains compiler errors.
 * c. Three lines contains compiler errors.
 * d. The code compiles but throws a ClassCastException at runtime.
 * e. The program compilesand prints 3. 
 * f. The program compilesand prints 0. 
 * 
 * A20. e.
 */

public class Macaw extends Parrot {
    public Macaw(int z) {
        super(z);
    }

    public Macaw fly() {
        return new Macaw(3);
    }

    public static void main(String[] args) {
        Bird p = new Macaw(4);
        System.out.println(((Parrot) p.fly()).feathers);
    }
}
