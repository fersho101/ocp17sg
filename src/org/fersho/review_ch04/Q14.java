/*
 * Q14. Given the following, which can correctly fill tha blank?
 * a. Instance.now()
 * 
 * A14: a, f.
 */
package org.fersho.review_ch04;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Q14 {
    public static void main(String[] args) {
        var date = LocalDate.now();
        var time = LocalTime.now();
        var dateTime = LocalDateTime.now();
        var zoneId = ZoneId.systemDefault();
        var zonedDateTime = ZonedDateTime.of(dateTime, zoneId);
        Instant instant = zonedDateTime.toInstant();
        System.out.println(instant);
    }
}
