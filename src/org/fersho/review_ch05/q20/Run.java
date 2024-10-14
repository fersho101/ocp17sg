/*
 * Q20'. Which of the following are true about the following code?
 * a. The code prints out 2-4- 
 * b. The code prints out 3-4-
 * c. The code prints out 4-2-
 * d. The code prints out 4-4-
 * e. The code prints out 3-4- if you remove the method static void execute(int num)
 * f. The code prints out f-4- if you remove the method static void execute(int num)
 * 
 * A20: a, e
 */
package org.fersho.review_ch05.q20;

public class Run {
    static void execute() {
        System.out.println("1-");
    }

    // static void execute(int num) {
    //     System.out.println("2-");
    // }

    static void execute(Integer num) {
        System.out.println("3-");
    }

    static void execute(Object num) {
        System.out.println("4-");
    }

    static void execute(int... nums) {
        System.out.println("5-");
    }

    public static void main(String[] args) {
        Run.execute(100);
        Run.execute(100L);
    }
}
