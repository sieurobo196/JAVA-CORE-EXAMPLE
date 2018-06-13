package com.codewr.javacore.date.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author codewr
 */
public class DateCompareAfterBeforce {

    public static void main(String[] args) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date1 = sdf.parse("2018-03-31");
            Date date2 = sdf.parse("2018-03-31");

            System.out.println("date1 : " + sdf.format(date1));
            System.out.println("date2 : " + sdf.format(date2));

            if (date1.after(date2)) {
                System.out.println("Date1 is after Date2");
            }

            if (date1.before(date2)) {
                System.out.println("Date1 is before Date2");
            }

            if (date1.equals(date2)) {
                System.out.println("Date1 is equal Date2");
            }
        } catch (ParseException ex) {
            System.err.println("ParseException " + ex);
        }

    }
}
