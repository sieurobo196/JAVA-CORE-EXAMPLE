/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codewr.javacore.regular.expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author codewr
 */
public class Time24HoursValidator {

    private static final String TIME24HOURS_PATTERN
            = "([01]?[0-9]|2[0-3]):[0-5][0-9]";

    public static void main(String[] args) {
        Time24HoursValidator time24HoursValidator = new Time24HoursValidator();
        //check  time validate
        boolean isValid = time24HoursValidator.validate("1:00");
        System.out.println("time valid is " + isValid);
    }

    /**
     * Validate time with regular expression
     *
     * @param time time for validation
     * @return true valid time, false invalid time
     */
    public boolean validate(final String time) {
        Pattern pattern = Pattern.compile(TIME24HOURS_PATTERN);
        Matcher matcher = pattern.matcher(time);
        return matcher.matches();

    }
}
