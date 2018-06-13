package com.codewr.javacore.date.time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

/**
 *
 * @author codewr
 */
public class TestCustomTemporalAdjusterDate {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println("current date : " + localDate);

         

        localDate = localDate.with(new NextChristmas());
        System.out.println("Next Christmas : " + localDate);
       
    }
}
