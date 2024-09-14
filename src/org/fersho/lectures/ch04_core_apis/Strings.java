package org.fersho.lectures.ch04_core_apis;

public class Strings {
    public static void main(String[] args) {

        // Creating a string

        String name = "Fluffy";
        String name2 = new String("Fluffy");
        String name3 = """
                Fluffy""";
        System.out.println(name + " " + name2 + " " + name3);


        //Concatenating

        //Rules
        // 1. If both are number, + means numeric addition.
        // 2. If either operand is a String, + means concatenations.
        // 3. The expession is evaluated left to right.

        //Examples:
        System.out.println(1 +2); //3
        System.out.println("a" + "b"); //ab
        System.out.println("a" + "b" + 3); //ab3
        System.out.println(1 + 2 + "c"); //3c
        System.out.println("c" + 1 + 2); //c12
        System.out.println("c" + null); //cnull
        int three = 3;
        String four = "4";
        System.out.println(1 +2 + three + four); //64

    }
}
