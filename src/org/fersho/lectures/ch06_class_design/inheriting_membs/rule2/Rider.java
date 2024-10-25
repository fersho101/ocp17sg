package org.fersho.lectures.ch06_class_design.inheriting_membs.rule2;

/*
 * Rule 2. Access Modifiers. 
 * -> The method in the child class must be at least as accesible as the parent class.
 */

class Camel {
    public int getNumberOfHumps() {
        return 1;
    }
}

class BactrianCamel extends Camel {
    // private int getNumberOfHumps() { // Does not compile
    //     return 2;
    // }
}

public class Rider {
    public static void main(String[] args) {
        Camel c = new BactrianCamel();
        System.out.print(c.getNumberOfHumps());
    }
}
