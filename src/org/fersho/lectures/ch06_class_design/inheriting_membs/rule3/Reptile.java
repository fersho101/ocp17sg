package org.fersho.lectures.ch06_class_design.inheriting_membs.rule3;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * Rule 3. The method in the child class  may not declare a checked exception the is new or broader than the class of any exception declared in the parent class method.
 */
public class Reptile {
    protected void sleep() throws IOException {
    }

    protected void hide() {
    }

    protected void exitShell() throws FileNotFoundException {
    }
}

class GalapagosTortoise extends Reptile {
    public void sleep() throws FileNotFoundException {
    }
    // public void hide() throws FileNotFoundException {} // does not compile, declaring a new exception
    // public void exitShell() throws IOException {} // does not compile, broader exception than the parent 
}
