package com.codewr.others;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author codewr
 */
public class GetAllDatesAMonth {

    public static void main(String[] args) {
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        System.out.println(cal.getTime());
        cal.set(Calendar.DAY_OF_MONTH, 1);
        int myMonth = cal.get(Calendar.MONTH);
        System.err.println("month " + myMonth);
        System.out.println(cal.getTime());

        while (myMonth == cal.get(Calendar.MONTH)) {
            System.out.println(cal.getTime());
            cal.add(Calendar.DAY_OF_MONTH, 1);
        }
    }
}
