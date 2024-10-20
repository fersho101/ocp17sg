package org.fersho.lectures.ch06_class_design.constructors;

// Creating simple constructor

public class Bunny {

    public Bunny() {
        System.out.println("hop");
    }

}

// Bad constructors

class BadBunnyConstructor {

    // public bunny() {} // Does not compile, it doesn't match the class name.

    public void Bunny() {
    } // This is a method because has a return type.
}

// Constructor may not include "var"
class Bonobo {
    // public Bonobo(var food) {} // Does not compile.
}