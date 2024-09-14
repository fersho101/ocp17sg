package org.fersho.lectures.ch03_making_decisions;

import java.util.Scanner;

public class SwitchStatement {

    public static void printDayOfWeek(int day) {
        switch (day) {
            case 1:
                System.out.print("Sunday");
                break;
            case 2:
                System.out.print("Monday");
                break;
            case 3:
                System.out.print("Tuesday");
                break;
            case 4:
                System.out.print("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }

    public static void printDayOfWeek2(int day) {
        String resul = switch (day) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> "Invalid value";
        };
        System.out.println(resul);
    }

    public static void printSeason(int month) {
        switch (month) {
            case 1, 2, 3:
                System.out.println("Winter");
                break;
            case 4, 5, 6:
                System.out.println("Spring");
                break;
            case 7, 8, 9:
                System.out.println("Summer");
                break;
            case 10, 11, 12:
                System.out.println("Fall");
                break;
            default:
                System.out.println("Unknown");
                break;
        }
    }

    public static void printSeason2(int month) {
        String res = switch (month) {
            case 1, 2, 3 -> {
                System.out.println("Winter");
                yield "yield";

            }
            case 4, 5, 6 -> {
                System.out.println("Spring");
                yield "yield";

            }
            case 7, 8, 9 -> {
                System.out.println("Summer");
                yield "yield";

            }
            case 10, 11, 12 -> {
                System.out.println("Fall");
                yield "yield";
            }
            default -> "No return";
        };
        
        System.out.println(res);
    }

    public static void anotherSwitch(int x) {
        switch (x) {
            case 1 -> System.out.println("1");
            case 2 -> System.out.println("2");
            case 3 -> System.out.println("3");
            case 4, 5, 6 -> System.out.println("Mayor que 3, menor que 7");
            default -> System.out.println("Mayor o igual que 7");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Digite el valor del dia(1 al 7): ");
        // int myDay = sc.nextInt();
        // System.out.println("Digite el valor del mes: ");
        // int month = sc.nextInt();
        System.out.println("Digite un numero entero positivo: ");
        int x = sc.nextInt();
        sc.close();
        // printDayOfWeek(myDay);
        // printSeason(month);
        anotherSwitch(x);
    }

}
