/*
 * Q11. What is the output of calling printLocation(Animal.MAMMAL)?
 * a. 3
 * b. 4
 * c. 34
 * d. The code does not compile because of line 13(18).
 * e. The code does not compile because of line 17(22).
 * f. None of above.
 * A11: a.  
 */
package org.fersho.review_ch03;

public class Q11 {

    enum Animal {BIRD, FISH, MAMMAL}

    void printAnimal(Animal a) {
        long type = switch(a) {
            case BIRD -> 1;
            case FISH -> 2;
            case MAMMAL -> 3;
            default -> 4;
        };
        System.out.println(type);
    }

    public static void main(String[] args) {
        Q11 q11 = new Q11();
        q11.printAnimal(Animal.MAMMAL);
    }
}

