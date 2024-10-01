package org.fersho.lectures.ch05_methods.passing_data;

public class Dog2 {
    public static void speak(StringBuilder s) {
        s.append("Georgette");
    }

    public static void main(String[] args) {
        var name = new StringBuilder("webby");
        speak(name);
        System.out.println(name); //webbyGeorgette
    }

    // s is a copy of name, and both point to same stringbuilder

}
