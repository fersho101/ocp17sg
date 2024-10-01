package org.fersho.lectures.ch05_methods.passing_data;

public class Dog {
    public static void speak(String name) {
        name = "Georgette";
    }

    public static void main(String[] args) {
        String name = "Webby";
        speak(name);
        System.out.println(name); // Webby
    }
}
