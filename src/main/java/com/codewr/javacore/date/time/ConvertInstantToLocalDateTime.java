package com.codewr.javacore.date.time;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneOffset;

/**
 *
 * @author codewr
 */
public class ConvertInstantToLocalDateTime {

    public static void main(String[] args) {
        ConvertInstantToLocalDateTime convert = new ConvertInstantToLocalDateTime();
        convert.convertInstantToLocalDateTime();
        convert.convertLocalDateTimeToInstant();
    }

    public void convertInstantToLocalDateTime() {
        System.out.println("---convertInstantToLocalDateTime");
        // Parse a ISO 8601 Date directly
        //Instant instant = Instant.parse("2018-03-29T04:55:14.380Z");
        Instant instant = Instant.now();

        System.out.println("Instant : " + instant);

        //Convert instant to LocalDateTime, no timezone, add a zero offset / UTC+0
        LocalDateTime ldt = LocalDateTime.ofInstant(instant, ZoneOffset.UTC);

        System.out.println("LocalDateTime : " + ldt);

    }

    public void convertLocalDateTimeToInstant() {
        System.out.println("---convertLocalDateTimeToInstant");
        // Hard code a date time
        LocalDateTime dateTime = LocalDateTime.of(2018, Month.MARCH, 29, 6, 17, 10);

        System.out.println("LocalDateTime : " + dateTime);

        // Convert LocalDateTime to Instant, UTC+0
        Instant instant = dateTime.toInstant(ZoneOffset.UTC);

        System.out.println("Instant : " + instant);
    }
}
