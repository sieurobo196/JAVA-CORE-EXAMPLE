package com.codewr.others;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author codewr
 */
public class GetAllDatesAYear {

    public static void main(String[] args) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2018);
        for (int i = 0; i < 12; i++) {
            cal.set(Calendar.MONTH, i);
            cal.set(Calendar.DAY_OF_MONTH, 1);
            int myMonth = cal.get(Calendar.MONTH);
            while (myMonth == cal.get(Calendar.MONTH)) {
                Date date = cal.getTime();
                System.out.println(dateFormat.format(date));
                cal.add(Calendar.DAY_OF_MONTH, 1);
            }
        }
    }
}
