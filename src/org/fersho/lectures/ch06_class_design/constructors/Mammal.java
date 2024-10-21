package org.fersho.lectures.ch06_class_design.constructors;
// Default constructor Tips and tricks

public class Mammal {

    public Mammal(int age) {
    }
}

/*
Does not compile because the compiler doesn't insert a default no-args constructor in Mammal
*/
// class Seal extends Mammal {}

/*
Does not compile, the compiler will insert a default constructor to a nonexistent super(). 
*/

// class Elephant extends Mammal {
//     public Elephant() {} 
// }

/*
 * Similar reasons
 */

// class Seal extends Mammal {
//     public Seal() {
//         super(); //Does not compile because the default constructor doesn't exist.
//     }
// }

// class Elephant extends Mammal {
//     public Elephant() {
//         super(); //Does not compile because the default constructor doesn't exist.
//     }
// }

/*
 * Must be create at least one constructor in the child class that explicitly calls a parent constructor via super()
 */

 class Seal extends Mammal {
    public Seal() {
        super(6); //Explicit call to parent constructor.
    }
 }

 class Elephant extends Mammal {
    public Elephant() {
        super(4); //Explicit call to parent constructor.
    }
 }

 /*
  * Compiles because Elephant includes a no-args constructor.
  */
 class AfricanElephant extends Elephant {}

 /* super() always refers to the most direct parent */