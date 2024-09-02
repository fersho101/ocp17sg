/*
 * Q17. What distinct numbers are printed when the following method is executed?
 * a. 6
 * b. 3
 * c. 4
 * d. 5
 * e. 10
 * f. 9
 * g. The code does not compile.
 * h. None of the above.
 */
package org.fersho.review_ch03;

public class Q17 {

    private void countAttendees() {
        int participants = 4, animals = 2, performers = -1;
        while((participants = participants + 1) < 10) {} 
        for(;performers<2;performers+=2){}

        System.out.println(participants);
        System.out.println(animals);
        System.out.println(performers);
    }

    public static void main(String[] args) {
        Q17 q17 = new Q17();
        q17.countAttendees();
    }

}
