package org.fersho.review_ch06.q01;

/*
 * Q01. Which code can be inserted to have the code print 2?
 * a. Replace line 1 with BirdSeed(2);
 * b. Replace line 2 with BirdSeed(2);
 * c. Replace line 1 with new BirdSeed(2);
 * d. Replace line 2 with new BirdSeed(2);
 * e. Replace line 1 with this(2);
 * f. Replace line 2 with this(2);
 * g. The code prints 2 without any change.
 * 
 * A06: e.
 */

public class BirdSeed {
    private int numberBags;
    boolean call;

    public BirdSeed() {
        // Line 1
        this(2);
        call = false;
        // Line 2
    }

    public BirdSeed(int numberBags) {
        this.numberBags = numberBags;
    }

    public static void main(String[] args) {
        var seed = new BirdSeed();
        System.out.println(seed.numberBags);
    }
}
