package org.fersho.review_ch06.q10;

/*
 * Q10. Which of the following pairs, when inserted into the blanks, allow the code to compile?
 * a. this(3) at line 3, this("") at line 14
 * b. this() at line 3, super(1) at line 14
 * c. this((short)1) at line 3, this(null) at line 14
 * b. super() at line 3, super() at line 14
 * e. this(2L) at line 3, super((short)2) at line 14
 * f. this(5) at line 3, super(null) at line 14
 * g. Remove line 3 and line 14
 * 
 * A10: a, c.
 */
public class Howler {
    public Howler(long shadow) {
        // Insert code here line 3.
        this(3);
    }

    private Howler(int moon) {
        super();
    }
}

class Wolf extends Howler {
    protected Wolf(String stars) {
        super(2L);
    }

    public Wolf() {
        // Insert code here line 14.
        this("");
    }
}
