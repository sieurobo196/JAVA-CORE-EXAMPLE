package com.codewr.javacore.IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author codewr
 */
public class ReadObjectFromFile {

    public static void main(String args[]) {

        ReadObjectFromFile obj = new ReadObjectFromFile();

        User user = obj.deserialzeAddress("c:\\uploadFile\\user2.ser");

        System.out.println(user);
        System.out.println(user.getFirstName());
        System.out.println(user.getLastName());

    }

    public User deserialzeAddress(String filename) {

        User user= null;

        FileInputStream fin = null;
        ObjectInputStream ois = null;

        try {

            fin = new FileInputStream(filename);
            ois = new ObjectInputStream(fin);
            user = (User) ois.readObject();

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {

            if (fin != null) {
                try {
                    fin.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

        return user;

    }

    public User deserialzeAddressJDK7(String filename) {

        User user = null;

        try (ObjectInputStream ois
                = new ObjectInputStream(new FileInputStream(filename))) {

            user = (User) ois.readObject();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return user;

    }

}

