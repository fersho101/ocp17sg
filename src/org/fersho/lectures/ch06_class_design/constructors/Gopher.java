package org.fersho.lectures.ch06_class_design.constructors;

public class Gopher {

    public Gopher(int dugHoles) {
        // this(5); // Recursive constructor invoke, cycle, does not compile.
    }
}

class Gopher2 {
    //Recursive constructor invocation. Constructors call each other infinitely.
    public Gopher2() {
        //  this(5);
    }
    public Gopher2(int dugHoles) {
        //  this();
    }
}
