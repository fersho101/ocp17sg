package org.fersho.lectures.ch05_methods.boxing;

public class ExamplesBoxing {

    public static void main(String[] args) {

        int quack = 5;
        Integer quackquack = Integer.valueOf(quack);
        int quackquackquack = quackquack.intValue();

        int cuak = 5;
        Integer cuakcuak = cuak; // Autoboxing
        Integer cuakcuakcuak = cuakcuak; // Unboxing

        // other examples

        Short tail = 8;
        Character p = Character.valueOf('p');
        char paw = p;
        Boolean nose = true;
        Integer e = Integer.valueOf(9);
        long ears = e;

        // Long badGorilla = 8; // cant cast to a long and then autobox a wrapper Long.

        Character elephant = null;
        // char badElephant = elephant; // doesn't compile, because java tries to get tha char value of null.       
        
    }
    
    

}
