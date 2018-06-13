package com.codewr.javacore.regular.expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author codewr
 */
public class Time12HoursValidator {

    private static final String TIME12HOURS_PATTERN
            = "(1[012]|[1-9]):[0-5][0-9](\\s)?(?i)(am|pm)";

    public static void main(String[] args) {
        Time12HoursValidator time12HoursValidator = new Time12HoursValidator();
        //check  time validate
        boolean isValid = time12HoursValidator.validate("1:00pm");
        System.out.println("time valid is " + isValid);
    }

    /**
     * Validate time with regular expression
     *
     * @param time time for validation
     * @return true valid time, false invalid time
     */
    public boolean validate(final String time) {
        Pattern pattern = Pattern.compile(TIME12HOURS_PATTERN);
        Matcher matcher = pattern.matcher(time);
        return matcher.matches();

    }
}
