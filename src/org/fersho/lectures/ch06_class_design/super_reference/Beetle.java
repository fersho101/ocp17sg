package org.fersho.lectures.ch06_class_design.super_reference;

public class Beetle extends Insect {

    protected int numberOfLegs = 6;
    short age = 3;

    public void printData() {
        System.out.println(this.label); // buggy
        System.out.println(super.label); // buggy
        System.out.println(this.age); // 3
        // System.out.println(super.age); // Does not compile
        System.out.println(numberOfLegs); // 6
        System.out.println();
        System.out.println(this.numberOfLegs); // 6
        System.out.println(super.numberOfLegs); // 4
    }

    public static void main(String[] args) {
        new Beetle().printData();
    }

}
