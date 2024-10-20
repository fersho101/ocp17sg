package org.fersho.lectures.ch06_class_design.constructors;

//  Calling overloaded constructors

public class Hamster {
    @SuppressWarnings("unused")
    private String color;
    @SuppressWarnings("unused")
    private int weight;

    public Hamster(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public Hamster(int weight) {
        this.weight = weight;
    }

}

 
/* Bad constructors calls

 * public Hamster(int weight) { // 2nd constructor
 *     Hamster(weight, "brown"); // does not compile
 * }
 * 
 * public Hamster(int weight) { // 2nd constructor
 *     new Hamster(weight, "brown"); // Compiles, but creates an extra object
 * }
 * 
 * Good constructors calls
 * 
 * public Hamster(int weight) { // 2nd constructor
 *     this(weight, "brown"); 
 * }
 * 
 * //this -> refers to an instance of the class
 * //this() -> refers to a constructor call within the class.
 *          must be the first statement in the constructor,
 *          one call to this in any constructor.
 * 
 * by example:
 * 
 * public Hamster(int weight) { // 2nd constructor
 *      System.out.println("chew");
 *      // Set weight and default color  // the comment is ok
 *      this(weight, "brown"); // does not compile, it is not the first statement.
 * }
 * 
 * 
 */
