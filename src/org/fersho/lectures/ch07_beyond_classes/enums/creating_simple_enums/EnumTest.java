package org.fersho.lectures.ch07_beyond_classes.enums.creating_simple_enums;

public class EnumTest {
    public static void main(String[] args) {
        var s = Season.SUMMER;
        System.out.println(s);
        System.out.println(Season.SUMMER);
        System.out.println(s == Season.SUMMER);

        System.out.println();

        for (var Season : Season.values()) {
            System.out.println(Season.name() + " " + Season.ordinal());
        }

        // using enums in switch statement
        // Season summer = Season.SUMMER;
        Season winter = Season.WINTER;
        var s2 = winter;

        switch (s2) {
            case Season.WINTER:
                System.out.println("Get out the sled!");
                break;
            case SUMMER:
                System.out.println("Time for the pool!");
                break;
            default:
                System.out.println("Is it summer yet?");
                break;
        }

        System.out.println("Example switch 2");
        Season sum = Season.SUMMER;
        var mess = switch (sum) {
            case Season.WINTER -> "Get out the sled!";
            // case 0 -> "Time for the pool!";
            default -> "Is it summer yet?";
        };
        
        System.out.println(mess);

    }
}
