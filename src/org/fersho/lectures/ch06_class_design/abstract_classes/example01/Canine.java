package org.fersho.lectures.ch06_class_design.abstract_classes.example01;

public abstract class Canine {
    public abstract String getSound();

    public void bark() {
        System.out.println(getSound());
    }
}

// bad abstract implementations 

// class FennecFox extends Canine {
//     public int getSound() { // return type is incompatible
//         return 10;
//     }
// }

// class ArcticFox extends Canine {} // does not implement the inherit abstract method

class DireWolf extends Canine {
    // public abstract rest(); //  class isn't abstract and declare an abstract method.
    public String getSound() {
        return "Roof!";
    }
}

class Jackal extends Canine {
    // public abstract String name; // illegal modifier field
    public String getSound() {
        return "Laugh!";
    }
}

abstract class Alligator {
    public static void main(String[] args) {
        // var a = new Alligator(); 
    }
}