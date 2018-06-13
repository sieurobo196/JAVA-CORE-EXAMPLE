package com.codewr.javacore.regular.expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author codewr
 */
public class HexValidator {

     /**
     *  ^             #start of the line
     *  #	      #  must constains a "#" symbols
     *  (             #  start of group #1
     * [A-Fa-f0-9]{6} #  any strings in the list, with length of 6
     * |	      #    ..or
     * [A-Fa-f0-9]{3} #  any strings in the list, with length of 3
     *  )	      #  end of group #1 
     *  $	      #end of the line
     */
    private static final String HEX_PATTERN = "^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$";

    public static void main(String[] args) {
        HexValidator hexValidator = new HexValidator();
        //check  hex color validate
        boolean isValid = hexValidator.validate("#aff");
        System.out.println("hex color valid is " + isValid);
    }

    /**
     * Validate hex color with regular expression
     *
     * @param hex hex color for validation
     * @return true valid hex color, false invalid hex color
     */
    public boolean validate(final String hex) {
        Pattern pattern = Pattern.compile(HEX_PATTERN);
        Matcher matcher = pattern.matcher(hex);
        return matcher.matches();

    }
}
