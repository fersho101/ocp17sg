package org.fersho.review_ch06.q20;

public class Bird {
    int feathers = 0;
    Bird(int x) {
        this.feathers = x;
    }
    Bird fly() {
        return new Bird(1);
    }
}
