package org.fersho.lectures.ch05_methods.pond.goose;

import org.fersho.lectures.ch05_methods.pond.duck.DuckTeacher;

public class LostDuckling {
    public void swim() {
        var teacher = new DuckTeacher();
        teacher.swim();
        System.out.println("Thanks " + teacher.name);
    }
}
