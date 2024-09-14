package org.fersho.lectures.ch02_operators;

public class UnaryOperators {
    public static void main(String[] args) {
        // Logical complement operator (!)

        // boolean isAnimalAsleep = false;
        // System.out.println(isAnimalAsleep);
        // isAnimalAsleep = !isAnimalAsleep;
        // System.out.println(isAnimalAsleep);
        // System.out.println();

        /*
        Bitwise complement operator (~)
        int value = 3;
        int complement = ~value;
        System.out.println(value);
        System.out.println(complement);
        System.out.println();
        System.out.println(-1 * value - 1);
        System.out.println(-1 * complement - 1);
        */


        /* Negation operator (-) 
        float zooTemperature = 1.21f;
        System.out.println(zooTemperature);
        zooTemperature = - zooTemperature;
        System.out.println(zooTemperature);
        zooTemperature = -(-zooTemperature);
        System.out.println(zooTemperature); 
        */

        /* Increment (++) and decrement (--)  */
        int parkAttendece = 0;
        System.out.println(parkAttendece);
        System.out.println(++parkAttendece);
        System.out.println(parkAttendece++);
        System.out.println(parkAttendece--);
        System.out.println(--parkAttendece);
        System.out.println(parkAttendece);


    }
}
