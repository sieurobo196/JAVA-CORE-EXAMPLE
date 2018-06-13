package com.codewr.javacore.date.time;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 *
 * @author codewr
 */
public class ConvertInstantToZonedDateTime {

    public static void main(String[] args) {
        ConvertInstantToZonedDateTime convert = new ConvertInstantToZonedDateTime();
        convert.convertInstantToZonedDateTime();
        convert.convertZonedDateTimeToInstant();
    }

    public void convertInstantToZonedDateTime() {
        System.out.println("---convertInstantToZonedDateTime");
        // Z = UTC+0
        Instant instant = Instant.now();

        System.out.println("Instant : " + instant);

        // Japan = UTC+9
        ZonedDateTime jpTime = instant.atZone(ZoneId.of("Asia/Tokyo"));

        System.out.println("ZonedDateTime : " + jpTime);

        System.out.println("OffSet : " + jpTime.getOffset());
    }

    public void convertZonedDateTimeToInstant() {
        System.out.println("---convertZonedDateTimeToInstant");
        LocalDateTime dateTime = LocalDateTime.of(2018, Month.MARCH, 29, 6, 57, 38);

        // UTC+9
        ZonedDateTime jpTime = dateTime.atZone(ZoneId.of("Asia/Tokyo"));

        System.out.println("ZonedDateTime : " + jpTime);

        // Convert to instant UTC+0/Z , java.time helps to reduce 9 hours
        Instant instant = jpTime.toInstant();

        System.out.println("Instant : " + instant);
    }
}
