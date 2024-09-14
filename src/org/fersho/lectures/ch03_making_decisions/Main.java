package org.fersho.lectures.ch03_making_decisions;

public class Main {

    void compareIntegers(Number number) {
        if (number instanceof Integer) {
            Integer data = (Integer) number;
            System.out.println(data.compareTo(5));
        }
    }

    void compareIntegers2(Number number) {
        if (number instanceof Integer data) {
            System.out.println(data.compareTo(5));
        }
    }

    void printIntegersGreaterThan5(Number num) {
        if (num instanceof Integer data && data.compareTo(5) > 0) {
            System.out.println(data);
        }
    }
    /* DOES NOT COMPILE */
    // data is undefined
    // void printIntegersOrNumbersGreaterThan5(Number num) {
    // if (num instanceof Integer data || data.compareTo(5) > 0)
    // System.out.print(data);
    // }

    /* DOES NOT COMPILE */
    // data is can be undefined
    // void printIntegerTwice(Number n) {
    // if(n instanceof Integer data)
    // System.out.print(data.intValue());
    // System.out.print(data.intValue());
    // }

    void printOnlyIntegers(Number n) {

        if (!(n instanceof Integer data))
            return;
        // else
        System.out.print(data.intValue());

        // Another way
        /*
         * if(n instanceof Integer data)
         *   System.out.print(data.intValue());
         * else
         *   return;
         */
    }

    public static void main(String... args) {
        Main n = new Main();

        // int hourOfDay = 14, morningGreetingCount = 0;
        // if (hourOfDay < 11) {
        // System.out.println("Good morning");
        // morningGreetingCount++;
        // } else if (hourOfDay < 15)
        // System.out.println("Good Afternoon");
        // else {
        // System.out.println("Good Evening");
        // }
        // System.out.println(morningGreetingCount);

        // n.compareIntegers(1);
        // n.compareIntegers2(1);
        // n.printIntegersGreaterThan5(8);
        // n.printIntegersGreaterThan5(3);
        // System.out.println("end");

        n.printOnlyIntegers(3);

    }

}
