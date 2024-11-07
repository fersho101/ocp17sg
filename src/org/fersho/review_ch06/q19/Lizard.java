package org.fersho.review_ch06.q19;

/*
 * Q19. What is the output of the following code?
 * a. AALizard
 * b. BALizard
 * c. BLizaedA
 * d. ALizard
 * e. The code will not compile because of line 3.
 * f. None of the above.
 * 
 * A19: 
 */

public class Lizard extends Reptile {
    static {
        System.out.println("B");
    }

    public Lizard(int hatch) {        
    }

    public final void layEggs() {
        System.out.println("Lizard");
    }

    public static void main(String[] args) {
        var reptile = new Lizard(1);
        reptile.layEggs();
    }
}
