package org.fersho.lectures.ch06_class_design.initializing_instances;

class GiraffeFamily {
    static {
        System.out.print("A"); // *
    }
    {
        System.out.print("B");
    }

    public GiraffeFamily(String name) {
        this(1);
        System.out.print("C");
    }

    public GiraffeFamily() {
        System.out.print("D");
    }

    public GiraffeFamily(int stripes) {
        System.out.print("E");
    }
}

public class Okapi extends GiraffeFamily {
    static {
        System.out.print("F"); // *
    }

    public Okapi(int stripes) {
        super("sugar");
        System.out.print("G");
    }

    {
        System.out.print("H"); // *
    }

    public static void main(String[] args) {
        new Okapi(1);
        System.out.print(" ");
        new Okapi(2);
    }
}

// Output -> AFBECHG BECHG