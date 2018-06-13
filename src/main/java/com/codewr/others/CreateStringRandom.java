package com.codewr.others;

/**
 *
 * @author codewr
 */
public class CreateStringRandom {

    public static void main(String[] args) {
        CreateStringRandom createStringRandom = new CreateStringRandom();
        createStringRandom.generateCaptcha(6);

    }

    public void generateCaptcha(int captchaLength) {

        String saltChars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuffer captchaStrBuffer = new StringBuffer();
        java.util.Random rnd = new java.util.Random();

        // build a random captchaLength chars salt        
        while (captchaStrBuffer.length() < captchaLength) {
            int index = (int) (rnd.nextFloat() * saltChars.length());
            captchaStrBuffer.append(saltChars.substring(index, index + 1));
        }

        String randomStr = captchaStrBuffer.toString();
        System.out.println("string: " + randomStr);
    }

}
