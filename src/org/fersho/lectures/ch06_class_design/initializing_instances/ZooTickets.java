package org.fersho.lectures.ch06_class_design.initializing_instances;

public class ZooTickets {
    private String name = "BestZoo";
    {
        System.out.print(name + "-");
    }
    private static int COUNT = 0;
    static {
        System.out.print(COUNT + "-");
    }
    static {
        COUNT += 10;
        System.out.print(COUNT + "-");
    }

    public ZooTickets() {
        System.out.print("z-");
    }

    public static void main(String[] args) {
        new ZooTickets();
    }
    //Output
    // 0-10-BestZoo-z-
    //Explanation:
    // -> Star in the class, no superclass, so superclass is Object
    // -> next, Static components
    // -> next, initialize the instance, start the instance components
    // -> run the constructor
}
