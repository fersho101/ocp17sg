/*
 * Q22. what is the output of the following code?
 * a. 2022 APRIL 30
 * b. 2022 MAY 2
 * c. 2025 APRIL 2
 * d. 2025 APRIL 30
 * e. 2025 MAY 2
 * f. The code doesn´t compile.
 * g. A runtime exception is thrown. 
 */
package org.fersho.review_ch04;

import java.time.LocalDate;
import java.time.Month;

public class Q22 {
    public static void main(String[] args) {
        var date = LocalDate.of(2022, Month.APRIL, 30);
        date.plusDays(2); // the result was not saved
        date.plusYears(3); // // the result was not saved
        System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
    }
}
