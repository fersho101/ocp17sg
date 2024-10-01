package org.fersho.lectures.ch05_methods.statics;

public class Gorilla {
    public static int count;

    public static void addGorilla() {
        count++; // static method can refer to a static variable.
    }

    public void babyGorilla() {
        count++; // instance method can refer to a static variable.
    }

    public void announceBabies() { // instance method can call a static method.
        addGorilla();
        babyGorilla();
    }

    public static void annoncebabiesToEveryone() {
        addGorilla();
        // babyGorilla(); //static method can not call an instance method.
    }

    public int total;
    // public static double average = total / count; //static varable can not use instance varible.
     
}
