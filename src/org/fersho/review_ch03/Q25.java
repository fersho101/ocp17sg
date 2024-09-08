/*
 * Q25. What is the output of the following snippet?
 * a. -1
 * b. 0
 * c. 1
 * d. 2
 * e. 3
 * f. The code doesn't compile.
 * A25: d.
 */
package org.fersho.review_ch03;

public class Q25 {

    public static void main(String[] ar) {
        String instrument = "violin";
        final String CELLO = "cello";
        String viola = "viola";
        int p = -1;

        switch(instrument) {
            case "bass": break;
            case CELLO: p++;
            default: p++;
            case "VIOLIN": p++;
            case "viola": ++p; break;
        }
        System.out.println(p);
    }

}
