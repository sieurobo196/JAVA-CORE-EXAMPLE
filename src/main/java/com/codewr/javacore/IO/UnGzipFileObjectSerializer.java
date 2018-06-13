package com.codewr.javacore.IO;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.zip.GZIPInputStream;

/**
 *
 * @author codewr
 */
public class UnGzipFileObjectSerializer implements Serializable {

    public static void main(String args[]) {

        UnGzipFileObjectSerializer deserializer = new UnGzipFileObjectSerializer();
        User user = deserializer.deserialzeUser();
        System.out.println(user);
        System.out.println("first name: " + user.getFirstName());
        System.out.println("last name: " + user.getLastName());
    }

    public User deserialzeUser() {

        User user;

        try {

            FileInputStream fin = new FileInputStream("c:\\uploadFile\\user.gz");
            GZIPInputStream gis = new GZIPInputStream(fin);
            ObjectInputStream ois = new ObjectInputStream(gis);
            user = (User) ois.readObject();
            ois.close();

            return user;

        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
