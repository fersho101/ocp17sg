package org.fersho.review_ch06.q23;

public class Fox extends Canine {
    public Fox(long x) {
        print("p");
    }

    public Fox(String name) {
        this(2);
        print("z");
    }
}
