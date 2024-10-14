package org.fersho.lectures.ch05_methods.boxing;

public class Gorilla {
    public void rest(Long x) {
        System.out.println();
    }
    public static void main(String[] args) {
        var g = new Gorilla();
        // g.rest(8); // doesn't compile, java will cast or autobox the value, but not both at the same time.
    }
}
