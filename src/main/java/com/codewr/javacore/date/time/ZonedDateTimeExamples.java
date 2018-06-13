/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codewr.javacore.date.time;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author NXCOMM
 */
public class ZonedDateTimeExamples {

    public static void main(String[] args) {
        ZonedDateTimeExamples dateTimeExamples = new ZonedDateTimeExamples();
        dateTimeExamples.differentTimeZone1();
        dateTimeExamples.differentTimeZone2();
    }

    public void differentTimeZone1() {
        System.out.println("--differentTimeZone from Malaysia to Japan");
        DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm, dd MMM yyyy");

        LocalDateTime ldt = LocalDateTime.of(2018, Month.MARCH, 29, 3, 30);
        System.out.println("LocalDateTime : " + format.format(ldt));

        //UTC+8
        ZonedDateTime klDateTime = ldt.atZone(ZoneId.of("Asia/Kuala_Lumpur"));
        System.out.println("Depart : " + format.format(klDateTime));

        //UTC+9 and flight duration = 7 hours
        ZonedDateTime japanDateTime = klDateTime.withZoneSameInstant(ZoneId.of("Asia/Tokyo")).plusHours(7);
        System.out.println("Arrive : " + format.format(japanDateTime));

        System.out.println("\n---Detail---");
        System.out.println("Depart : " + klDateTime);
        System.out.println("Arrive : " + japanDateTime);

    }
    
    public void differentTimeZone2() {
        System.out.println("---differentTimeZone2");
        DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm, dd MMM yyyy");

        //Convert String to LocalDateTime
        String date = "2018-03-29 14:30";
        LocalDateTime ldt = LocalDateTime.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
        System.out.println("LocalDateTime : " + format.format(ldt));

        //Paris, 2018 Apr-Oct = DST, UTC+2, other months UTC+1
        //UTC+2
        ZonedDateTime parisDateTime = ldt.atZone(ZoneId.of("Europe/Paris"));
        System.out.println("Depart : " + format.format(parisDateTime));

        //hard code a zoneoffset like this, UTC-5
        ZoneOffset nyOffSet = ZoneOffset.of("-05:00");
        ZonedDateTime nyDateTime = parisDateTime.withZoneSameInstant(nyOffSet).plusHours(8).plusMinutes(10);
        System.out.println("Arrive : " + format.format(nyDateTime));

        System.out.println("\n---Detail---");
        System.out.println("Depart : " + parisDateTime);
        System.out.println("Arrive : " + nyDateTime);

    }
}
