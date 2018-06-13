
package com.codewr.javacore.regular.expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author codewr
 */
public class HTMLTagValidator {
    private static final String HTML_TAG_PATTERN  = "<(\"[^\"]*\"|'[^']*'|[^'\">])*>";

    public static void main(String[] args) {
         HTMLTagValidator hTMLTagValidator = new HTMLTagValidator();
        //check  html tag validate
        boolean isValid = hTMLTagValidator.validate("<b>");
        System.out.println("email valid is " + isValid);
    }

    /**
     * Validate html tag with regular expression
     *
     * @param tag html tag for validation
     * @return true valid html tag, false invalid html tag
     */
    public boolean validate(final String tag) {
        Pattern pattern = Pattern.compile(HTML_TAG_PATTERN );
        Matcher matcher = pattern.matcher(tag);
        return matcher.matches();

    }
}
