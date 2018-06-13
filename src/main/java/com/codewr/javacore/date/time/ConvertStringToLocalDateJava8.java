package com.codewr.javacore.date.time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author codewr
 */
public class ConvertStringToLocalDateJava8 {

    public static void main(String[] args) {
        ConvertStringToLocalDateJava8 convert = new ConvertStringToLocalDateJava8();
        convert.convert1();
        convert.convert2();
        convert.convert3();
        convert.convert4();
        convert.convert5();
        convert.convert6();
        convert.convert7();
    }

    public void convert1() {
        System.out.println("---Format String = 2018-03-29");
        String date = "2018-03-29";

        //default, ISO_LOCAL_DATE
        LocalDate localDate = LocalDate.parse(date);

        System.out.println(localDate);
    }

    public void convert2() {
        System.out.println("---Format String = 29-Mar-2018");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MMM-yyyy");

        String date = "29-Mar-2018";

        LocalDate localDate = LocalDate.parse(date, formatter);

        System.out.println(localDate);  //default, print ISO_LOCAL_DATE

        System.out.println(formatter.format(localDate));
    }

    public void convert3() {
        System.out.println("---Format String = 29/03/2018");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");

        String date = "29/03/2018";

        LocalDate localDate = LocalDate.parse(date, formatter);

        System.out.println(localDate);

        System.out.println(formatter.format(localDate));
    }

    public void convert4() {
        System.out.println("---Format String = Thu, Mar 29 2018");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E, MMM d yyyy");

        String date = "Thu, Mar 29 2018";

        LocalDate localDate = LocalDate.parse(date, formatter);

        System.out.println(localDate);

        System.out.println(formatter.format(localDate));

    }

    public void convert5() {
        System.out.println("---Format String = Thursday, Mar 29, 2018 12:10:56 PM");
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy HH:mm:ss a");

        String date = "Thursday, Mar 29, 2018 12:10:56 PM";

        LocalDateTime localDateTime = LocalDateTime.parse(date, formatter);

        System.out.println(localDateTime);

        System.out.println(formatter.format(localDateTime));
    }

    public void convert6() {
        System.out.println("---Format String = 2018-03-29T15:23:01Z");
        String dateInString = "2018-03-29T15:23:01Z";

        Instant instant = Instant.parse(dateInString);

        System.out.println("Instant : " + instant);

        //get date time only
        LocalDateTime result = LocalDateTime.ofInstant(instant, ZoneId.of(ZoneOffset.UTC.getId()));

        //get localdate
        System.out.println("LocalDate : " + result.toLocalDate());

        //get date time + timezone
        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.of("Asia/Tokyo"));
        System.out.println(zonedDateTime);

        //get date time + timezone
        ZonedDateTime zonedDateTime2 = instant.atZone(ZoneId.of("Europe/Athens"));
        System.out.println(zonedDateTime2);
    }

    public void convert7() {
        System.out.println("---Format String = 2018-03-29T10:15:30+08:00");
        String date = "2018-03-29T10:15:30+08:00";

        ZonedDateTime result = ZonedDateTime.parse(date, DateTimeFormatter.ISO_DATE_TIME);

        System.out.println("ZonedDateTime : " + result);

        System.out.println("TimeZone : " + result.getZone());

        LocalDate localDate = result.toLocalDate();

        System.out.println("LocalDate : " + localDate);
    }
}
