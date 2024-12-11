package org.fersho.lectures.ch07_beyond_classes.implementing_interfaces.static_interface_mthds;

public interface Hop {
    static int getJumping() {
        return 8;
    }
}

class Skip {
    public int skip() {
        return Hop.getJumping();
    }
}

class Bunny implements Hop {
    public void printDetails() {
        System.out.println(Hop.getJumping()); // it need explicit reference 
    }
}
