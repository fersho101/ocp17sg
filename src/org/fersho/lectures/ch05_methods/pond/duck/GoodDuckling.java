package org.fersho.lectures.ch05_methods.pond.duck;

public class GoodDuckling {
    public void makeNoise() {
        var duck = new MotherDuck();
        duck.quack();
        System.out.println(duck.noise);
    }
}
