package org.fersho.lectures.ch06_class_design.this_reference;

public class Duck {
    private String color;
    private int height;
    private int length;

    public void setData(int length, int theHeight) {
        length = this.length; // No good, it is backwards
        height = theHeight; // Fine, because a different name
        this.color = "white"; // Fine, but "this" reference not necessary
    }

    public static void main(String[] args) {
        Duck b = new Duck();
        b.setData(1, 2);
        System.out.println(b.length + " " + b.height + " " + b.color);
    }

}
