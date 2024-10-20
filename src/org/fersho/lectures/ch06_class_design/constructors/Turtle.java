package org.fersho.lectures.ch06_class_design.constructors;

// Overloading constructor

public class Turtle {
    private String name;

    public Turtle() {
    }

    public Turtle(int age) {
    }

    public Turtle(long age) {
    }

    public Turtle(String newName, String... favoriteFoods) {
        name = newName;
    }

    public static void main(String[] args) {
        Turtle t = new Turtle(); // calls first constructor
        System.out.println(t.name); // John Doe
        System.out.println(new Turtle(15)); // org.fersho.lectures.ch06_class_design.constructors.Turtle@4517d9a3
    }

}
