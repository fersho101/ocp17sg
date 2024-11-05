package org.fersho.lectures.ch06_class_design.abstract_classes.example01;

public abstract class Canine {
    public abstract String getSound();

    public void bark() {
        System.out.println(getSound());
    }
}
