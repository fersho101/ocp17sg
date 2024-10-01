package org.fersho.lectures.ch05_methods.statics;

public class StaticModifiers {
    class Zoopen {
        private static final int NUM_BUCKETS = 45;
       
    }

    class ZooInventoryManager {
        private static final String[] treats = new String[10];

        public static void main(String[] args) {
            treats[0] = "popcorn";
        }
    }

    class Panda {
        final static String name = "Ronda";
        static final int bamboo;
        // static final double height; // doesn't compile because never gets initalized.

        static {
            bamboo = 5;
        }
    }

    public static void main(String[] args) {
        System.out.println(Zoopen.NUM_BUCKETS);
        System.out.println(Panda.name);
    }

}
