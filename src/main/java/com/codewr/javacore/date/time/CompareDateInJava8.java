package com.codewr.javacore.date.time;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author codewr
 */
public class CompareDateInJava8 {
    public static void main(String[] args) {

        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date1 = LocalDate.of(2018, 03, 30);
        LocalDate date2 = LocalDate.of(2018, 03, 31);

        System.out.println("date1 : " + sdf.format(date1));
        System.out.println("date2 : " + sdf.format(date2));

        System.out.println("Use Is...");
        if (date1.isAfter(date2)) {
            System.out.println("Date1 is after Date2");
        }

        if (date1.isBefore(date2)) {
            System.out.println("Date1 is before Date2");
        }

        if (date1.isEqual(date2)) {
            System.out.println("Date1 is equal Date2");
        }

        System.out.println("Use CompareTo...");
        if (date1.compareTo(date2) > 0) {

            System.out.println("Date1 is after Date2");

        } else if (date1.compareTo(date2) < 0) {

            System.out.println("Date1 is before Date2");

        } else if (date1.compareTo(date2) == 0) {

            System.out.println("Date1 is equal to Date2");

        } else {

            System.out.println("How to get here?");

        }
    }
}
