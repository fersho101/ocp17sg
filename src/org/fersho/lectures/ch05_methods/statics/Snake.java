package org.fersho.lectures.ch05_methods.statics;

public class Snake {
    public static long hiss = 2;

    public static void main(String[] args) {
        System.out.println(Snake.hiss);
        
        Snake.hiss = 4;
        Snake snake1 = new Snake();
        Snake snake2 = new Snake();

        snake1.hiss = 6;
        snake2.hiss = 5;
        System.out.println(Snake.hiss);

    }
}
