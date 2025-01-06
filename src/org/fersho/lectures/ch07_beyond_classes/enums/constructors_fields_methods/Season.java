package org.fersho.lectures.ch07_beyond_classes.enums.constructors_fields_methods;

public enum Season {
    WINTER("Low"), SPRING("Medium"), SUMMER("High"), FALL("Medium");

    private final String expectedVisitors;

    // Illegal modifier for the enum constructor; only private is permitted.
    private Season(String expectedVisitors) {
        this.expectedVisitors = expectedVisitors;
    }

    public void printExpectedVisitors() {
        System.out.println(expectedVisitors);
    }
}

class Main {
    public static void main(String[] args) {
        Season.SUMMER.printExpectedVisitors();
        Season.SPRING.printExpectedVisitors();
        Season.FALL.printExpectedVisitors();
        Season.WINTER.printExpectedVisitors();
    }
}
