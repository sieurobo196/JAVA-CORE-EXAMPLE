package com.codewr.others;

import java.util.Date;
import java.util.TimeZone;

/**
 *
 * @author codewr
 */
public class GetTimeDST {

    public static void main(String[] args) {
        Date date = new Date(2018, 03, 29);
        boolean isDST = TimeZone.getTimeZone("Europe/Rome").inDaylightTime(date);
        System.out.println("is DST " + isDST);
        date = new Date(2018, 10, 25);
        isDST = TimeZone.getTimeZone("Europe/Rome").inDaylightTime(date);
        System.out.println("is DST " + isDST);
    }
}
