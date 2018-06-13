package com.codewr.javacore.regular.expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author codewr
 */
public class ImageValidator {

    private static final String IMAGE_PATTERN
            = "([^\\s]+(\\.(?i)(jpg|png|gif|bmp))$)";

    public static void main(String[] args) {
        ImageValidator imageValidator = new ImageValidator();
        //check  image validate
        boolean isValid = imageValidator.validate("a.pnsg");
        System.out.println("image valid is " + isValid);
    }

    /**
     * Validate image with regular expression
     *
     * @param image image for validation
     * @return true valid image, false image email
     */
    public boolean validate(final String image) {
        Pattern pattern = Pattern.compile(IMAGE_PATTERN);
        Matcher matcher = pattern.matcher(image);
        return matcher.matches();

    }
}
