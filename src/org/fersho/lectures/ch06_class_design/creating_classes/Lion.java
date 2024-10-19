package org.fersho.lectures.ch06_class_design.creating_classes;

public class Lion extends Animal {
    protected void setProperties(int age, String n) {
        setAge(age);
        name = n;
    }

    public void roar() {
        System.out.print(name + ", age " + getAge() + " says: Roar!");
        // System.out.println("Lion age: " + age);
    }

    public static void main(String[] args) {

        var lion = new Lion();
        lion.setProperties(3, "kion");
        lion.roar();
    }

}
