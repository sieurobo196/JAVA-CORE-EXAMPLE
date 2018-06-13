package com.codewr.javacore.date.time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author codewr
 */
public class FormatLocalDateTime {

    public static void main(String[] args) {
        FormatLocalDateTime formatLocalDateTime = new FormatLocalDateTime();
        formatLocalDateTime.test1();
        formatLocalDateTime.test2();
    }

    public void test1() {
        System.out.println("---Format LocalDateTime use DateTimeFormatter");
        //Get current date time
        LocalDateTime now = LocalDateTime.now();

        System.out.println("Before : " + now);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String formatDateTime = now.format(formatter);

        System.out.println("After : " + formatDateTime);
    }

    public void test2() {
        System.out.println("--- Convert String to LocalDateTime");
        String now = "2018-03-29 11:30";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        LocalDateTime formatDateTime = LocalDateTime.parse(now, formatter);

        System.out.println("Before : " + now);

        System.out.println("After : " + formatDateTime);

        System.out.println("After : " + formatDateTime.format(formatter));
    }
}
