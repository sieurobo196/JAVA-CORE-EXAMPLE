package com.codewr.javacore.regular.expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author codewr
 */
public class UsernameValidator {

//   ^         # Start of the line
//  [a-z0-9_-] # Match characters and symbols in the list, a-z, 0-9, underscore, hyphen
//   {3,15}    # Length at least 3 characters and maximum length of 15 
//   $         # End of the line
    private static final String USERNAME_PATTERN = "^[a-z0-9_-]{3,15}$";

    public static void main(String[] args) {
        UsernameValidator usernameValidator = new UsernameValidator();
        //check  username validate
        boolean isValid =usernameValidator.validate("codewr12");
        System.out.println("username valid is " + isValid);
    }

    /**
     * Validate username with regular expression
     *
     * @param username username for validation
     * @return true valid username, false invalid username
     */
    public boolean validate(final String username) {
        Pattern pattern = Pattern.compile(USERNAME_PATTERN);
        Matcher matcher = pattern.matcher(username);
        return matcher.matches();

    }

}
