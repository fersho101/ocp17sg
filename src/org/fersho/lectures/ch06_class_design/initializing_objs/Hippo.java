package org.fersho.lectures.ch06_class_design.initializing_objs;

public class Hippo extends Animal {
    public static void main(String[] args) {
        System.out.print("C");
        new Hippo();
        new Hippo();
        new Hippo();
    }

    static {
        System.out.print("B");
    }
}

class Animal {
    static {
        System.out.print("A");
    }
}
