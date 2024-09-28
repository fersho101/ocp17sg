/*
 * Q11. What is the output of the following code?
 * a. 2022 MARCH 4 
 * b. 2022 MARCH 6 
 * c. 2022 APRLI 3 
 * d. 2022 APRLI 5 
 * e. The code does not complie. 
 * f. A runtime exception is thrown.
 * 
 * A11: f. 
 */
package org.fersho.review_ch04;

import java.time.LocalDate;

public class Q11 {
    public static void main(String[] args) {
        var date = LocalDate.of(2022, 4, 3);
        date.plusDays(2); // it was not saved
        // date.plusHours(3); // Does not compile, LocalDate has no time
        System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth() + " " + date.getDayOfWeek()); // 2022 APRIL 3 SUNDAY
    }
}
