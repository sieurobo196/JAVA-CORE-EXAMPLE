
package com.codewr.javacore.date.time;

import java.time.LocalDate;
import java.time.chrono.MinguoDate;

/**
 *
 * @author codewr
 */
public class TestMinguoDate {
     public static void main(String[] args) {

        // LocalDate -> MinguoDate
        System.out.println("Example 1...");        

        LocalDate localDate = LocalDate.of(1912, 1, 1);
        MinguoDate minguo = MinguoDate.from(localDate);
        System.out.println("LocalDate : " + localDate); //1912-01-01
        System.out.println("MinguoDate : " + minguo);   //1-01-01

        // MinguoDate -> LocalDate
        System.out.println("\nExample 2...");

        MinguoDate minguo2 = MinguoDate.of(107, 3, 30);
        //LocalDate localDate = LocalDate.ofEpochDay(minguo2.toEpochDay());
        LocalDate localDate2 = LocalDate.from(minguo2);
        System.out.println("MinguoDate : " + minguo2);   //107-03-30
        System.out.println("LocalDate : " + localDate2); //2018-03-30
    }

}
