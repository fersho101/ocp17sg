package org.fersho.lectures.ch07_beyond_classes.implementing_interfaces.default_interface_method.inheriting_duplicate_def_mthds;

public interface Walk {
    public default int getSpeed() {
        return 5;
    }
}

interface Run {
    public default int getSpeed() {
        return 10;
    }
}

class Cat implements Walk, Run {

    // Duplicate default methods named getSpeed with the parameters () and () are inherited from the types Run and Walk
    public int getSpeed() {return 1;}

    //Calling hidden default method
    public int getWalkSpeed() {        
        return Walk.super.getSpeed(); //special sintaxis
    }

}