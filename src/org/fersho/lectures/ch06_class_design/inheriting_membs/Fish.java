package org.fersho.lectures.ch06_class_design.inheriting_membs;

public class Fish {
    public void swim() {
    }
}

class Shark extends Fish {
    @Override
    public void swim() {
    }
}
 //Bad override anotation

 /*

public class Fish {
    public void swim() {
    }
}

class Shark extends Fish {
    @Override
    public void swim(int speed) {
    }
}

  */