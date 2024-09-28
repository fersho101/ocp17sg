package org.fersho.lectures.ch04_core_apis;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DatesAndTimes {
    public static void main(String[] args) {
        // static method .now()
        System.out.println(LocalDate.now()); // 2024-09-23
        System.out.println(LocalTime.now()); // 11:32:17.919828900
        System.out.println(LocalDateTime.now()); // 2024-09-23T11:32:17.919828900
        System.out.println(ZonedDateTime.now()); // 2024-09-23T11:32:17.921912400-07:00[America/xxxxxxx]

        // Creating a simple date
        var d1 = LocalDate.of(2022, Month.APRIL, 2);
        var d2 = LocalDate.of(2022, 2, 2);
        System.out.println(d1);
        System.out.println(d2);

        // Creating a simple time
        var t1 = LocalTime.of(6, 15);
        var t2 = LocalTime.of(6, 15, 30);
        var t3 = LocalTime.of(6, 15, 30, 20000);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        // local date and time

        var dt1 = LocalDateTime.of(2022, Month.AUGUST, 06, 6, 15, 30);
        var dt2 = LocalDateTime.of(d1, t1);
        System.out.println(dt1);
        System.out.println(dt2);

        //Zoned date time
        var zone = ZoneId.of("US/Eastern");
        var dtz = ZonedDateTime.of(d1,t1,zone);
        System.out.println(dtz);

    }
}
