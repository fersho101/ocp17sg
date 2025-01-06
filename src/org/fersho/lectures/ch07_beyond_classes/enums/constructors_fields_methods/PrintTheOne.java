package org.fersho.lectures.ch07_beyond_classes.enums.constructors_fields_methods;

enum OnlyOne {
    ONCE(true);

    private OnlyOne(boolean b) {
        System.out.println("constructing,");
    }
}

public class PrintTheOne {
    public static void main(String[] args) {
        System.out.println(OnlyOne.ONCE);
        System.out.println("begin, ");
        OnlyOne firstCall = OnlyOne.ONCE;
        OnlyOne secondCall = OnlyOne.ONCE;
        System.out.println("end.");

        System.out.println(firstCall);
        System.out.println(secondCall);
    }
}
