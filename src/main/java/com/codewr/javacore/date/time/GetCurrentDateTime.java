package com.codewr.javacore.date.time;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author codewr
 */
public class GetCurrentDateTime {

    private static final DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    public static void main(String[] args) {
        // use Date
        Date date = new Date();
        System.out.println(sdf.format(date));
        // use Calendar
        Calendar cal = Calendar.getInstance();
        System.out.println(sdf.format(cal.getTime()));
        // use LocalDateTime
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
        // use LocalDate
        LocalDate localDate = LocalDate.now();
        System.out.println(DateTimeFormatter.ofPattern("yyy/MM/dd").format(localDate));

    }

}
