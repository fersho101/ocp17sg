package org.fersho.review_ch06.q15;

/*
 * Q15. Which statement about the following program are correct?
 * a. it compiles and prints true.
 * b. It compile and prints false.
 * c. The code will not compile because of line 2. 
 * d. The code will not compile because of line 5. 
 * e. The code will not compile because of line 7. 
 * f. The code will not compile because of line 8. 
 */

abstract class Nocturnal {
    abstract boolean isBlind(); // adding abstract keyword to make the code compile.
}

public class Owl extends Nocturnal {
    public boolean isBlind() {
        return false;
    }

    public static void main(String[] args) {
        var nocturnal = (Nocturnal) new Owl();
        System.out.println(nocturnal.isBlind());
    }
}