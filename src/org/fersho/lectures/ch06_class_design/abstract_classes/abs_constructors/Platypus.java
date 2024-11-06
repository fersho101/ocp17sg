package org.fersho.lectures.ch06_class_design.abstract_classes.abs_constructors;

public class Platypus extends Mammal {
    String chew() {
        return "yummy!";
    }
    public static void main(String[] args) {
        new Platypus();
    }
}
