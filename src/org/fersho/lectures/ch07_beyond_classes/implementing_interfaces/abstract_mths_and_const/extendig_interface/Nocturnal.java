package org.fersho.lectures.ch07_beyond_classes.implementing_interfaces.abstract_mths_and_const.extendig_interface;

public interface Nocturnal {
    public int hunt();
}

interface HashBigEyes extends Nocturnal, CanFly {

}

interface CanFly {
    public void flap();
}

