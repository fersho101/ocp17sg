/*
 * Q20. Which statement, when inserted into the following blanks, allow the code to compile and run without entering an infinite loop?
 * a. break L2 on line 8; continue L2 on line 12
 * b. continue on line 8; continue on line 12
 * c. break L3 on line 8; break L1 on line 12
 * d. continue L2 on line 8; continue L3 on line 12
 * e. continue L2 on line 8; continue L2 on line 12
 * f. None of the above, as the code contains a compiler error
 * A20: a, e. 
 */
package org.fersho.review_ch03;

public class Q20 {
    public static void main(String[] args) {

        int height = 1;
        L1: while (height++ < 18) {
            long humidity = 12;
            L2: do {
                if (humidity-- % 12 == 0) {
                    continue L2;
                }
                int temperature = 30;
                L3: for (;;) {
                    temperature++;
                    if (temperature > 50) {
                        continue L2;
                    }
                }
            } while (humidity > 4);
        }
    }
}
