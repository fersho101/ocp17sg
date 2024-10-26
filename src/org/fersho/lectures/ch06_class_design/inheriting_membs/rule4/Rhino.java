package org.fersho.lectures.ch06_class_design.inheriting_membs.rule4;

/*
 * Rule 4 -> If the method returns a value, it must bet the same or a subtype of the method in the parent class, known a as covariant return type.
 */

public class Rhino {
    protected CharSequence getName() {
        return "rhino";
    }

    protected String getColor() {
        return "grey, black or white";
    }
}

class JavanRhino extends Rhino {
    public String getName() {
        return "javan rhino";
    }

    // public CharSequence getColor() {
    //    return "grey";
    // }
}
