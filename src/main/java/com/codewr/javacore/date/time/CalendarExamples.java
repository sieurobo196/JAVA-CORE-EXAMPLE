
package com.codewr.javacore.date.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author codewr
 */
public class CalendarExamples {

    public static void main(String[] args) {
        CalendarExamples calendarExamples = new CalendarExamples();
        calendarExamples.getCurrentDateTime();
        calendarExamples.getCalendarAPI();
        calendarExamples.setDate();
        calendarExamples.addOrSubtractDate();
        calendarExamples.convertDateToCalendar();
    }
//    Get current date time

    public void getCurrentDateTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
        Calendar calendar = new GregorianCalendar(2018, 0, 31);
        System.out.println("Output getCurrentDateTime--");
        System.out.println(sdf.format(calendar.getTime()));
    }
//     Simple Calendar example

    public void getCalendarAPI() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
        Calendar calendar = new GregorianCalendar(2018, 1, 28, 13, 24, 56);

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH); // Jan = 0, dec = 11
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
        int weekOfMonth = calendar.get(Calendar.WEEK_OF_MONTH);

        int hour = calendar.get(Calendar.HOUR);        // 12 hour clock
        int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY); // 24 hour clock
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        int millisecond = calendar.get(Calendar.MILLISECOND);
        System.out.println("Output getCalendarAPI--");
        System.out.println(sdf.format(calendar.getTime()));

        System.out.println("year \t\t: " + year);
        System.out.println("month \t\t: " + month);
        System.out.println("dayOfMonth \t: " + dayOfMonth);
        System.out.println("dayOfWeek \t: " + dayOfWeek);
        System.out.println("weekOfYear \t: " + weekOfYear);
        System.out.println("weekOfMonth \t: " + weekOfMonth);

        System.out.println("hour \t\t: " + hour);
        System.out.println("hourOfDay \t: " + hourOfDay);
        System.out.println("minute \t\t: " + minute);
        System.out.println("second \t\t: " + second);
        System.out.println("millisecond \t: " + millisecond);
    }

    //Set a date manually.
    public void setDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");

        Calendar calendar = new GregorianCalendar(2018, 1, 28, 13, 24, 56);
        System.out.println("Output setDate--");
        System.out.println("#1. " + sdf.format(calendar.getTime()));

        //update a date
        calendar.set(Calendar.YEAR, 2018);
        calendar.set(Calendar.MONTH, 11);
        calendar.set(Calendar.MINUTE, 33);

        System.out.println("#2. " + sdf.format(calendar.getTime()));
    }
//    Add or subtract from a date.

    public void addOrSubtractDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd");

        Calendar calendar = new GregorianCalendar(2018, 10, 28);
        System.out.println("Output addOrSubtractDate--");
        System.out.println("Date : " + sdf.format(calendar.getTime()));

        //add one month
        calendar.add(Calendar.MONTH, 1);
        System.out.println("Date : " + sdf.format(calendar.getTime()));

        //subtract 10 days
        calendar.add(Calendar.DAY_OF_MONTH, -10);
        System.out.println("Date : " + sdf.format(calendar.getTime()));
    }
//    Convert Date to Calendar

    public void convertDateToCalendar() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
            String dateInString = "22-01-2018 10:20:56";
            Date date = sdf.parse(dateInString);

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            System.out.println("Output convertDateToCalendar--");
            System.out.println(sdf.format(calendar.getTime()));
        } catch (ParseException ex) {
            Logger.getLogger(CalendarExamples.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
