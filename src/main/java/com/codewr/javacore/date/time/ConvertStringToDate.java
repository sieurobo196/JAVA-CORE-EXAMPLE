package com.codewr.javacore.date.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.TimeZone;

/**
 *
 * @author codewr
 */
public class ConvertStringToDate {

    public static void main(String[] args) {
        ConvertStringToDate convertStringToDate = new ConvertStringToDate();
        convertStringToDate.convert1();
        convertStringToDate.convert2();
        convertStringToDate.convert3();
        convertStringToDate.convert4();
        convertStringToDate.convert5();
        convertStringToDate.convertObjectInstantJava8();
    }
//    String = 7-Jun-2013

    public void convert1() {
        System.out.println("---Format String = 7-Jun-2013 ");
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
        String dateInString = "7-Jun-2018";

        try {

            Date date = formatter.parse(dateInString);
            System.out.println(date);
            System.out.println(formatter.format(date));

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
//    String = 07/06/2013

    public void convert2() {
        System.out.println("---Format  String = 07/06/2013 ");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String dateInString = "07/06/2018";

        try {

            Date date = formatter.parse(dateInString);
            System.out.println(date);
            System.out.println(formatter.format(date));

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
//    String = Fri, June 7 2013

    public void convert3() {
        System.out.println("---Format String = Fri, June 7 2013 ");
        SimpleDateFormat formatter = new SimpleDateFormat("E, MMM dd yyyy");
        String dateInString = "Fri, June 7 2018";

        try {

            Date date = formatter.parse(dateInString);
            System.out.println(date);
            System.out.println(formatter.format(date));

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
//String = Friday, Jun 7, 2013 12:10:56 PM

    public void convert4() {
        System.out.println("---Format String = Friday, Jun 7, 2013 12:10:56 PM ");
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE, MMM dd, yyyy HH:mm:ss a");
        String dateInString = "Friday, Jun 7, 2013 12:10:56 PM";

        try {

            Date date = formatter.parse(dateInString);
            System.out.println(date);
            System.out.println(formatter.format(date));

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
//String = 2014-10-05T15:23:01Z

    public void convert5() {
        System.out.println("---Format String = 2014-10-05T15:23:01Z");
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
        String dateInString = "2014-10-05T15:23:01Z";

        try {

            Date date = formatter.parse(dateInString.replaceAll("Z$", "+0000"));
            System.out.println(date);
            System.out.println("time zone : " + TimeZone.getDefault().getID());
            System.out.println(formatter.format(date));

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
//    java.time.Instant object

    public void convertObjectInstantJava8() {
        System.out.println("---Convert String to Oject Instant in java8");
        String dateInString = "2014-10-05T15:23:01Z";

        Instant instant = Instant.parse(dateInString);

        System.out.println(instant);

        //get date time only
        LocalDateTime result = LocalDateTime.ofInstant(instant, ZoneId.of(ZoneOffset.UTC.getId()));

        System.out.println(result);

        //get date time + timezone
        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.of("Africa/Tripoli"));
        System.out.println(zonedDateTime);

        //get date time + timezone
        ZonedDateTime zonedDateTime2 = instant.atZone(ZoneId.of("Europe/Athens"));
        System.out.println(zonedDateTime2);
    }
}
