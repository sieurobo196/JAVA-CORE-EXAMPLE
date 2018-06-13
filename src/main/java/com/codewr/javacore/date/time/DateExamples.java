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
public class DateExamples {

    public static void main(String[] args) {
        DateExamples dateExamples = new DateExamples();
        dateExamples.convertDateToString();
        dateExamples.convertStringToDate();
        dateExamples.getCurrentDateTime();
        dateExamples.convertCalendarToDate();
    }

    //Convert Date to String.
    public void convertDateToString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
        String date = sdf.format(new Date());
        System.out.println("Output convertDateToString--");
        System.out.println(date); //27/3/2018
    }
    //Convert String to Date.
    public void convertStringToDate() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
            String dateInString = "27-03-2018 10:20:56";
            Date date = sdf.parse(dateInString);
            System.out.println("Output convertStringToDate--");
            System.out.println(date); //Tue Mar 27 10:20:56 ICT 2018
        } catch (ParseException ex) {
            Logger.getLogger(DateExamples.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //Get current date time
    public void getCurrentDateTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println("Output getCurrentDateTime--");
        System.out.println(dateFormat.format(date)); //2018/03/27 16:15:06
    }
    //Convert Calendar to Date
    public void convertCalendarToDate() {
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        System.out.println("Output convertCalendarToDate--");
        System.out.println(date);//Tue Mar 27 16:15:06 ICT 2018
    }
}
