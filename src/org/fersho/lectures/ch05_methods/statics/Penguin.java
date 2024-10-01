package org.fersho.lectures.ch05_methods.statics;

public class Penguin {
    String name;
    static String nameOfTallestPenguin;

    public static void main(String[] args) {
        var p1 = new Penguin();
        p1.name = "Lilly";
        p1.nameOfTallestPenguin = "Lilly";

        var p2 = new Penguin();
        p2.name = "Willy";
        p2.nameOfTallestPenguin = "Willy";

        nameOfTallestPenguin = "Oscar";
        Penguin.nameOfTallestPenguin = "Miguel";

        System.out.println(p1.name);
        System.out.println(p1.nameOfTallestPenguin);
        System.out.println(p2.name);
        System.out.println(p2.nameOfTallestPenguin);
        System.out.println(nameOfTallestPenguin);

    }

}
