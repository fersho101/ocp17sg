/*
 * Q10. Given the following method, how manny lines contains compilation errors?
 * a. None, the code compiles without issue.
 * b. 1
 * c. 2
 * d. 3
 * e. 4
 * f. 5
 * g. 6
 * h. The code compiles but may produce an error at runtime.
 * A10: e.
 * NOTE:
 * line 30. continue cannot be used in switch statement like that.
 * line 31. Any int value can be passed as parameter. Marking it final does not change this.
 * line 33. Sunday is not marked as final.
 * line 34. The case value is an enum and must be an int.
 * Note2: 
 * Line 27 is commented out to avoid the warning.
 */
package org.fersho.review_ch03;

import java.time.DayOfWeek;

public class Q10 {
    private DayOfWeek getWeekDay(int day, final int thursday) {
        int otherDay = day;
        // int Sunday = 0;
        switch (otherDay) {
            default:
                // case 1: continue;
                // case thursday: return DayOfWeek.THURSDAY;
            case 2, 10:
                break;
            // case Sunday: return DayOfWeek.SUNDAY;
            // case DayOfWeek.MONDAY: return DayOfWeek.MONDAY;
        }
        return DayOfWeek.FRIDAY;
    }

    public static void main(String[] args) {
        Q10 q10 = new Q10();
        q10.getWeekDay(2, 4);
    }

}
