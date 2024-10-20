package org.fersho.lectures.ch06_class_design.super_reference;

public class Crocodile extends Reptile {
    protected int speed = 20;

    public int getSpeed() {
        return speed;
    }

    public int getSpeedSuper() {
        return super.speed;
    }

    public static void main(String[] args) {
        var croc = new Crocodile();
        System.out.println(croc.getSpeed()); // 20
        System.out.println(croc.getSpeedSuper()); // 10
    }
}
