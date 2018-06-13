package com.codewr.javacore.date.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author codewr
 */
public class CalendarCompare {

    public static void main(String[] args) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date1 = sdf.parse("2018-03-31");
            Date date2 = sdf.parse("2018-04-30");

            System.out.println("date1 : " + sdf.format(date1));
            System.out.println("date2 : " + sdf.format(date2));

            Calendar cal1 = Calendar.getInstance();
            Calendar cal2 = Calendar.getInstance();
            cal1.setTime(date1);
            cal2.setTime(date2);

            if (cal1.after(cal2)) {
                System.out.println("Date1 is after Date2");
            }

            if (cal1.before(cal2)) {
                System.out.println("Date1 is before Date2");
            }

            if (cal1.equals(cal2)) {
                System.out.println("Date1 is equal Date2");
            }
        } catch (ParseException ex) {
            System.err.println("ParseException "+ex);
        }
    }

}
