package org.fersho.lectures.ch05_methods.statics;

// import static java.util.Arrays; //  tries to use static import a class
import static java.util.Arrays.asList;
// static import java.util.Arrays.*; //  the sintaxis is reverse

public class BadStaticsImports {
    class BadZooParking {
        public static void main(String[] args) {
            // Arrays.asList("one"); // Arrays. prefix isnt need anymore.
            asList("two");
        }
    }
}
