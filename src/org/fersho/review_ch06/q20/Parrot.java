package org.fersho.review_ch06.q20;

public class Parrot extends Bird {
    protected Parrot(int y) {
        super(y);
    }
    protected Parrot fly() {
        return new Parrot(2);
    }
}
