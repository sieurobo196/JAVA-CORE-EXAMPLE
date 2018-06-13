package com.codewr.javacore.regular.expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author codewr
 */
public class IPAddressValidator {
     private static final String IPADDRESS_PATTERN = 
		"^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

    public static void main(String[] args) {
        IPAddressValidator iPAddressValidator = new IPAddressValidator();
        //check  ip address validate
        boolean isValid = iPAddressValidator.validate("a.pnsg");
        System.out.println("ip address valid is " + isValid);
    }

    /**
     * Validate ip address with regular expression
     *
     * @param ip  ip address for validation
     * @return true valid ip address, false ip address email
     */
    public boolean validate(final String ip) {
        Pattern pattern = Pattern.compile(IPADDRESS_PATTERN);
        Matcher matcher = pattern.matcher(ip);
        return matcher.matches();

    }
}
