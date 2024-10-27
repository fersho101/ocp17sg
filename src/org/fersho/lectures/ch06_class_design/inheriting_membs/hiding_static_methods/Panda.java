package org.fersho.lectures.ch06_class_design.inheriting_membs.hiding_static_methods;

/*
 * Rule 5. The method defined in the child class must be marked as static if it is marked as static in the a parent class.
 * 
 * method hiding -> if the two methods are marked static.
 * method overriding -> if the two methods are not marked statoc.
 */
class Bear {
    public static void eat() {
        System.out.println("Bear is eating");
    }

    public static void sneeze() {
        System.out.println("Bear is sneezing");
    }

    public void hibernate() {
        System.out.println("Bear is hinbernating");
    }

    public static void laugh() {
        System.out.println("Bear is laughing");
    }
}

class Panda extends Bear {
    public static void eat() {
        System.out.println("Panda is chewing");
    }

    public static void main(String[] args) {
        eat();
    }
}

class SunBear extends Bear {
    //Doesn't compile, it isn't static and the parent is.
    // public void sneeze() {
    //     System.out.println("Bear is sneezing");
    // }

    // Doesn't compile, it isn't static and the parent isn't
    // public static void hibernate() {
    //     System.out.println("Bear is hinbernating");
    // }

    // Doesn't compile, second rule, this is more restrictive than the parent.
    // protected static void laugh() {
    //     System.out.println("Bear is laughing");
    // }
}
