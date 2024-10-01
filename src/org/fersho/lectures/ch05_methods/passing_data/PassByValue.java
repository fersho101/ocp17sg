package org.fersho.lectures.ch05_methods.passing_data;

public class PassByValue {
    public static void main(String[] args) {
        int num = 4;
        newNumber(num);
        System.out.println(num);
        
    }

    public static void newNumber(int num) {
        num = 8;
        System.out.println(num);        
    }
}
