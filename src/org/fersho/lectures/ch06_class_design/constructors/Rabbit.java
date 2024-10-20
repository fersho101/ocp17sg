package org.fersho.lectures.ch06_class_design.constructors;

//Default constructor

public class Rabbit {
    public static void main(String[] args) {
        new Rabbit(); // calls the default constructor
    }
}

class Rabbitt {
    public Rabbitt() {
    }

    public static void main(String[] args) {
        new Rabbitt(); // Calls the user-defined constructor.
    }
}

class Rabbit1 {
}

class Rabbit2 {
    public Rabbit2() {
    }
}

class Rabbit3 {
    public Rabbit3(boolean b) {
    }
}

class Rabbit4 {
    private Rabbit4() {
    }
}

class RabbitsMultiply {
    public static void main(String[] args) {
        var r1 = new Rabbit1();
        var r2 = new Rabbit2();
        var r3 = new Rabbit3(true);
        // var r4 = new Rabbit4(); // does not compile because it is private.
    }
}
