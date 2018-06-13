package com.codewr.javacore.regular.expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author codewr
 */
public class EmailValidator {
    
    private static final String EMAIL_PATTERN = 
		"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
		+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public static void main(String[] args) {
         EmailValidator emailValidator = new EmailValidator();
        //check  email validate
        boolean isValid = emailValidator.validate("codewr@gmail.com");
        System.out.println("email valid is " + isValid);
    }

    /**
     * Validate email with regular expression
     *
     * @param email email for validation
     * @return true valid email, false invalid email
     */
    public boolean validate(final String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();

    }
}
