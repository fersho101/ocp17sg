package org.fersho.lectures.ch06_class_design.abstract_classes.example01;

public class Fox extends Canine {
    public String getSound() {
        return "Squeak";
    }

    public static void main(String[] args) {
        Canine w = new Fox();
        w.bark(); // Squeak
    }
}
