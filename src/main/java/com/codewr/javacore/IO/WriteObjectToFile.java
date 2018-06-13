package com.codewr.javacore.IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author codewr
 */
public class WriteObjectToFile {

    public static void main(String args[]) {

        WriteObjectToFile obj = new WriteObjectToFile();

        User user = new User();
        user.setFirstName("Tom");
        user.setLastName("Cruise");
        obj.serializeAddress(user);
        obj.serializeAddressJDK7(user);

    }

    public void serializeAddress(User user) {

        FileOutputStream fout = null;
        ObjectOutputStream oos = null;

        try {

            fout = new FileOutputStream("c:\\uploadFile\\user.ser");
            oos = new ObjectOutputStream(fout);
            oos.writeObject(user);

            System.out.println("Done");

        } catch (Exception ex) {

            ex.printStackTrace();

        } finally {

            if (fout != null) {
                try {
                    fout.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    public void serializeAddressJDK7(User user) {

        try (ObjectOutputStream oos
                = new ObjectOutputStream(new FileOutputStream("c:\\uploadFile\\user2.ser"))) {

            oos.writeObject(user);
            System.out.println("Done");

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
