package org.fersho.lectures.ch06_class_design.constructors;
// Default constructor Tips and tricks

public class Mammal {

    public Mammal(int age) {
    }
}

/*
Does not compile because the compiler doesn't insert a default no-args constructor in Mammal
class Seal extends Mammal {}

Does not compile, the compiler will insert a default constructor to a nonexistent super().
class Elephant extends Mammal {
    public Elephant() {} 
}

*/
