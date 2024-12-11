package org.fersho.lectures.ch07_beyond_classes.implementing_interfaces.abstract_mths_and_const.inheriting_interface;

public class Swan extends Bird implements Swim {

    @Override
    public void fly() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fly'");
    }

    @Override
    public void swim() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'swim'");
    }

    @Override
    boolean canSwoop() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'canSwoop'");
    }

    @Override
    int getType() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getType'");
    }

}

abstract class Animal {
    abstract int getType();
}

interface Fly {
    void fly();
}

interface Swim {
    void swim();
}

abstract class Bird extends Animal implements Fly {
    abstract boolean canSwoop();
}

