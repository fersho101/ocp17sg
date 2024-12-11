package org.fersho.lectures.ch07_beyond_classes.implementing_interfaces.private_interface_mthds;

public interface Schedule {
    default void wakeUp() {
        checkTime(7);
    }

    private void haveBreakfast() {
        checkTime(9);
    }

    static void workOut() {
        checkTime(8);
    }

    private static void checkTime(int hr) {
        if (hr > 17) {
            System.out.println("You're late!");
        } else {
            System.out.println("You have " + (17 - hr) + " hours left to make the appointment");           
        } 
    }

    private void checkIng(int hr) {
        haveBreakfast();
        checkTime(2);
        wakeUp();
        workOut();        
    } 
    
}

class Probando implements Schedule {
    public static void main(String[] args) {
        Schedule.workOut();    
        // Schedule.checkTime(2);
        
    }
}
