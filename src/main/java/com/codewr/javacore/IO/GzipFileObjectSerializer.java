
package com.codewr.javacore.IO;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.zip.GZIPOutputStream;

/**
 *
 * @author codewr
 */

public class GzipFileObjectSerializer implements Serializable {

    public static void main(String args[]) {

        GzipFileObjectSerializer serializer = new GzipFileObjectSerializer();
        serializer.serializeAddress("wall street", "united state");
    }

    public void serializeAddress(String firstName, String lastName) {

        User user = new User();
        user.setFirstName("Tom");
        user.setLastName("Cruise");

        try {

            FileOutputStream fos = new FileOutputStream("c:\\uploadFile\\user.gz");
            GZIPOutputStream gz = new GZIPOutputStream(fos);

            ObjectOutputStream oos = new ObjectOutputStream(gz);

            oos.writeObject(user);
            oos.close();

            System.out.println("Done");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
