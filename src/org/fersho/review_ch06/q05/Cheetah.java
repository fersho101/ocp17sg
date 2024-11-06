package org.fersho.review_ch06.q05;
/*
 * Q05. Which of the following complete the constructor so that this code prints out 50?
 * a. numSpots = numSpots;
 * b. numSpots = this.numSpots;
 * c. this.numSpots = numSpots;
 * d. numSpots = super.numSpots;
 * e. super.numspots = numSpots;
 * f. The code does not compile regardless of the code inserted into the constructor.
 * g. None of the above.
 * 
 * A05: c, e
 */

public class Cheetah extends Speedster {
    public Cheetah(int numSpots) {
        // Insert code here
        super.numSpots = numSpots;
    }

    public static void main(String[] args) {
        Speedster s = new Cheetah(50);
        System.out.println(s.numSpots);
    }
}
