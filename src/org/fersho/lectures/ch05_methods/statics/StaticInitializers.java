package org.fersho.lectures.ch05_methods.statics;

public class StaticInitializers {
    private static final int NUM_SECONDS_PER_MINUTE;
    private static final int NUM_MINUTES_PER_HOUR;
    private static final int NUM_SECONDS_PER_HOUR;

    static {
        NUM_SECONDS_PER_MINUTE = 60;
        NUM_MINUTES_PER_HOUR = 60;
    }

    static {
        NUM_SECONDS_PER_HOUR = NUM_SECONDS_PER_MINUTE * NUM_MINUTES_PER_HOUR;
    }

    public static void main(String[] args) {
        System.out.println(NUM_SECONDS_PER_HOUR + " " + "seconds");
    }

    // other example

    private static int one;
    private static final int two;
    private static final int three = 3;
    // private static final int four; //never gets initilized

    static {
        one = 1;
        two = 2;
        // three = 3; //second attempt.
        // two = 4; // second attempt.
    }

}
