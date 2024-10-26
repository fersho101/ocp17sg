package org.fersho.lectures.ch06_class_design.inheriting_membs.redeclaring_private_methods;

public class Betlee {
    private String getSize() {
        return "Undefined";
    }
}

class RhinocerosBetlee extends Betlee {
    private int getSize() {
        return 5;
    }
}
/*
 * -> Doesn't exist such thing.
 * -> The method in the child class is a diferent and new method and independet
 * from the method on the parent class.
 * -> If the method were public, we would have an invalid method in the child
 * class.
 */