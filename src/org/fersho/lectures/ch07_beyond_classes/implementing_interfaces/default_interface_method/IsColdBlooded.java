package org.fersho.lectures.ch07_beyond_classes.implementing_interfaces.default_interface_method;

public interface IsColdBlooded {
    boolean hasScales();
    default double getTemp() {
        return 10.0;
    }
}

class Snake implements IsColdBlooded {
    //must be implement
    @Override
    public boolean hasScales() {
        // TODO Auto-generated method stub
        return false;
    }
    //Optional
    @Override
    public double getTemp() {
        // TODO Auto-generated method stub
        return IsColdBlooded.super.getTemp();
    }
    
}

interface Carnivore {
    // public default void eatMeat(); //This method requires a body instead of a semicolon

    //Abstract methods do not specify a body
    // public int getRequiredFoodAmount(){
    //     return 13;
    // }
}
