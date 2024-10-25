package org.fersho.lectures.ch06_class_design.inheriting_membs;

class Marsupial {
    public double getAverageWeight() {
        return 50;
    }
}

public class Kanguroo extends Marsupial {
    public double getAverageWeight() {
        return super.getAverageWeight() + 20;
    }

    public static void main(String[] args) {
        System.out.println(new Marsupial().getAverageWeight()); // 50
        System.out.println(new Kanguroo().getAverageWeight()); // 70
    }
}
