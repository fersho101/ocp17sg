package org.fersho.review_ch06.q12;

/*
 * Q12. How many lines of the following program contain a compilation error?
 * a. None
 * b. 1
 * c. 2 
 * d. 3
 * e. 4
 * f. 5 
 * 
 * A12: c.
 */
public class Rodent {

    public Rodent(Integer x) {
    }

    protected static Integer chew() throws Exception {
        System.out.println("Rodent is chewing");
        return 1;
    }
}

// class Beaver extends Rodent {
//     public Number chew() throws RuntimeException {
//         System.out.println("Beaver is chewing on wood");
//         return 2;
//     }
// }
