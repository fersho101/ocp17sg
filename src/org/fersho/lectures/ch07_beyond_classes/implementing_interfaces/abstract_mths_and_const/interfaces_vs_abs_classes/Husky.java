package org.fersho.lectures.ch07_beyond_classes.implementing_interfaces.abstract_mths_and_const.interfaces_vs_abs_classes;

public abstract class Husky {

    abstract void play();
}

interface Poodle {

    void play();
}

class Webby extends Husky {
    void play() {
    }
}

// class Georgette implements Poodle {    
//     // play() needs to be public    
//     public void play() {}
// }