package org.fersho.lectures.ch06_class_design.constructors;

public class Animal {
    private int age;

    public Animal(int age) {
        super(); // calls to the contructor in java.lang.Object
        this.age = age;
    }
}

class Zebra extends Animal {
    public Zebra(int age) {
        super(age); // calls to Animal's constructor
    }

    public Zebra() {
        this(4); // calls to the first constructor of Zebra.
    }

}

/*
 * super -> is used to reference memeber of the parent class
 * super() -> calls a parent constructor
 * -> can only be used in the first statement of the constructor.
 * -> one super for each constructor.
 * 
 */

 class Zoo {
    public Zoo() {
        System.out.println("Zoo created");
        // super(); // does not compile, must be in the first statement of the conatructor.
    }
 }

 class Zoo2 {
    public Zoo2() {
        super();
        System.out.println("Zoo created");
        // super(); // does not compile, one super() by constructor.
    }
 }