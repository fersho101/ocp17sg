package org.fersho.lectures.ch06_class_design.declaring_subclass;

public class Jaguar extends BigCat {

    public Jaguar() {
        size = 10.2;
    }

    public void printDetails() {
        System.out.println(size);
    }
    
    public static void main(String[] args) {
        Jaguar j1 = new Jaguar();
        System.out.println(j1.size);
    }
}
