package com.codewr.javacore.date.time;

import java.time.*;
import java.util.Date;

/**
 *
 * @author codewr
 */
public class JavaTimeToDate {

    public static void main(String[] args) {
        //Asia/Bangkok +7
        ZoneId defaultZoneId = ZoneId.systemDefault();
        System.out.println("System Default TimeZone : " + defaultZoneId);

        LocalDate localDate = LocalDate.of(2018, 3, 29);
        Date date = Date.from(localDate.atStartOfDay(defaultZoneId).toInstant());
        System.out.println("\n1. LocalDate -> Date");
        System.out.println("localDate : " + localDate);
        System.out.println("date : " + date);

        LocalDateTime localDateTime = LocalDateTime.of(2018, 3, 29, 3, 07, 31);
        Date date2 = Date.from(localDateTime.atZone(defaultZoneId).toInstant());
        System.out.println("\n2. LocalDateTime -> Date");
        System.out.println("localDateTime : " + localDateTime);
        System.out.println("date2 : " + date2);

        ZonedDateTime zonedDateTime = localDateTime.atZone(defaultZoneId);
        Date date3 = Date.from(zonedDateTime.toInstant());
        System.out.println("\n3. ZonedDateTime -> Date");
        System.out.println("zonedDateTime : " + zonedDateTime);
        System.out.println("date3 : " + date3);

    }
}
