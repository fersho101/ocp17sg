package org.fersho.review_ch06.q26;

/*
 * Q26. What is the output of the following code?
 * a. Orca diving
 * b. Orca diving deeper 3
 * c. The code will not compile because line 4. 
 * d. The code will not compile because line 8.
 * e. The code will not compile because line 11. 
 * f. The code will not compile because line 12. 
 * g. The code will not compile because line 17.
 * h. None of the above. 
 * 
 * A26: d.
 */

//line 4
public abstract class Whale {
    public abstract void dive();

    public static void main(String[] args) {
        Whale whale = new Orca();
        // line 8
        // whale.dive(3);
    }
}

// line 11
class Orca extends Whale {

    // line 12
    static public int MAX = 3;

    public void dive() {
        System.out.println("Orca diving");
    }

    public void dive(int... depth) {
        // line 17
        System.out.println("Orca diving depeer " + MAX);
    }
}
