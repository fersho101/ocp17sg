package org.fersho.lectures.ch05_methods.statics;

public class MantaRay {
    private String name = "Sammy";

    public static void first() {
    }

    public static void second() {
    }

    public void third() {
        System.out.println(name);
    }

    public static void third2() {
        // System.out.println(name); // does not compile
    }

    public static void main(String[] args) {
        first();
        second();
        // third(); // Does not compile

        // to fix the problem, call third() with a instance

        MantaRay rey = new MantaRay();
        var reyna = new MantaRay();

        rey.third();
        reyna.third();
    }
}
