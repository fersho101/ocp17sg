package org.fersho.lectures.ch06_class_design.this_reference;

public class Flamingo {
    private String color = null;

    public void setColor(String color) {
        // color = color; // whitout using "this", it prints null
        this.color = color;
    }

    public static void main(String[] args) {
        var f = new Flamingo();
        f.setColor("PINK");
        System.out.println(f.color);
    }
}
