package org.fersho.review_ch06.q18;

/*
 * Q18. Which statement about the following classes are correct?
 * a. The eat() in Mammal is correctly overriden on line 7.
 * b. The eat() in Mammal is correctly overloaded on line 7.
 * c. The drink() in Mammal is correctly overriden on line 10.
 * d. The drink() in Mammal is correctly hidden on line 10.
 * e. The dance() in Mammal is correctly overriden on line 11.
 * f. The dance() in Mammal is correctly overloaded on line 11.
 * g. The eat() in Primate is correctly hidden on line 12.
 * h. The eat() in Primate is correctly overloaded on line 12.
 * 
 * A18: d, f.
 */

public class Primate extends Mammal {
    public void eat(String p) {
    }
}

class Monkey extends Primate {
    public static void drink() throws RuntimeException {

    }

    public Number dance(CharSequence p) {
        return null;
    }

    public void eat(String p) {
    }
}
