package org.fersho.lectures.ch06_class_design.initializing_objs.final_fields;

// public class MouseHouse {
//     private final int volumen;
//     private final String name = "The Mouse House"; //Declaration assigment
//     {
//         volumen = 10; // Instance initalizer assigment
//     }
// }

/*
 * Example of initialization final fields inside the constructor
 */

 public class MouseHouse {
    private final int volumen;
    private final String name; 
    
    public MouseHouse() {
        this.name = "The Mouse House"; // Constructor assigment
    }

    {
        volumen = 10; // Instance initalizer assigment
    }
}

/*
 * Final instance vars must be assigned a value, failure to do so will result in a compiler error
 */

class MouseHouse2 {
    private final int volumen;
    private final String type;
    {
        this.volumen = 10;
    }
    public MouseHouse2(String type) {
        this.type = type;
    }
//  public MouseHouse2() { doesn't compile, fails to set value for the type value.
//      this.volumen = 2; // doesn't compile, valumen was already assigned a value.
//  }
    public MouseHouse2(){
        this(null);
    }
 }