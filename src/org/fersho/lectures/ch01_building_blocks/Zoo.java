package org.fersho.lectures.ch01_building_blocks;

public class Zoo {
    public static void main(String...args) {
        System.out.println("Hola, Zoo");
        System.out.println("Hola Girafa");
        System.out.println(args[0]);
        System.out.println(args[1]);

        /*
           PS C:\sg\ocp17sg\src> javac -d C:\sg\ocp17sg\bin\org\fersho\lectures\ch01_building_blocks\ org\fersho\lectures\ch01_building_blocks\Zoo.java
           PS C:\sg\ocp17sg\src> java -cp C:\sg\ocp17sg\bin\org\fersho\lectures\ch01_building_blocks\ org.fersho.lectures.ch01_building_blocks.Zoo
         */
    }
}
