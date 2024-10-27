package org.fersho.lectures.ch06_class_design.inheriting_membs.writing_final_methods;

class Bird {
    /*
     * Marking a method final, is forbid a child class from replacing this method.
     * for both, override and hide.
     */
    
    public final boolean hasFeathers() {
        return true;
    }

    public static final void flyAway() {
    }
}

public class Penguin extends Bird {
    // public final boolean hasFeathers() {
    //     return true;
    // }

    // public static final void flyAway() {
    // }
}
