package org.fersho.lectures.ch06_class_design.initializing_instances;

class Primate {
    public Primate() {
        System.out.print("Primate-");
    }
}

class Ape extends Primate {
    public Ape(int fur) {
        System.out.print("Ape1-");
    }

    public Ape() {
        System.out.print("Ape2-");
    }
}

public class Chimpanzee extends Ape {
    public Chimpanzee() {
        super(2);
        System.out.print("Chimpanzee-");
    }

    public static void main(String[] args) {
        new Chimpanzee();
    }
    // output
    // Primate-Ape1-Chimpanzee-
    /*
     * Explanation:
     * -> The compiler insert super() on Primate and Ape
     * -> The code will execute the parent constructors
     * -> The super() in Chimpanzee calls just one constructor in Ape.
     */
}
