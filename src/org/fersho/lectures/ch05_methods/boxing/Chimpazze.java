package org.fersho.lectures.ch05_methods.boxing;

class Chimpanzee {
    public void climb(long t) {
    }

    public void swing(Integer u) {
    }

    public void jump(int v) {
    }

    public static void main(String[] args) {
        var c = new Chimpanzee();
        c.climb(123);
        c.swing(123);
        // c.jump(123L); //long must be explicitly cast to an int.
    }
}
