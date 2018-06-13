
package com.codewr.others;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;

/**
 *
 * @author codewr
 */
public class ExampleCryptoSHA256Hmac {

    public static void main(String[] args) {
        try {
            String secret = "abcdefg";
            String message = "I love you";

            Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
            SecretKeySpec secret_key = new SecretKeySpec(secret.getBytes(), "HmacSHA256");
            sha256_HMAC.init(secret_key);

            String hash = Base64.encodeBase64String(sha256_HMAC.doFinal(message.getBytes()));

            System.out.println(hash);
            byte[] data = sha256_HMAC.doFinal(message.getBytes());
            String result = "";
            for (final byte element : data) {
                result += Integer.toString((element & 0xff) + 0x100, 16).substring(1);
            }
            System.out.println("hex:" + result );
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
