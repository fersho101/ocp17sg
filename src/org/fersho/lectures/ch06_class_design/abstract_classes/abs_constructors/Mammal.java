package org.fersho.lectures.ch06_class_design.abstract_classes.abs_constructors;

public abstract class Mammal {
    abstract CharSequence chew();
    public Mammal() {
        System.out.println(chew());
    }
}
