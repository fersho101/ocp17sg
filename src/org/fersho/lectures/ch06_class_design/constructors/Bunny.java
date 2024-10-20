package org.fersho.lectures.ch06_class_design.constructors;

public class Bunny {
    // Creating simple constructor

    public Bunny() {
        System.out.println("hop");
    }

}

class BadBunnyConstructor {

    // public bunny() {} // Does not compile, it doesn't match the class name.

    public void Bunny() {
    } // This is a method because has a return type.
}
