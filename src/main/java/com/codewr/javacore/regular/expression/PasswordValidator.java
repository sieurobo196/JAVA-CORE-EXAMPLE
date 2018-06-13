package com.codewr.javacore.regular.expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author codewr
 */
public class PasswordValidator {

    /**
     *  (	    Start of group 
     * (?=.*\d)	    must contains one digit from 0-9
     * (?=.*[a-z])  must contains one lowercase characters 
     * (?=.*[A-Z]   must contains one uppercase characters 
     * (?=.*[@#$%]) must contains one special symbols in the list "@#$%" 
     * .            match anything with previous condition checking
     * {6,20}       length at least 6 characters and maximum of 20
     *  )	    End of group
     */
    private static final String PASSWORD_PATTERN = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";

    public static void main(String[] args) {
        PasswordValidator passwordValidator = new PasswordValidator();
        //check  password validate
        boolean isValid = passwordValidator.validate("codewr12");
        System.out.println("password valid is " + isValid);
    }

    /**
     * Validate password with regular expression
     *
     * @param password password for validation
     * @return true valid password, false invalid password
     */
    public boolean validate(final String password) {
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();

    }
}
