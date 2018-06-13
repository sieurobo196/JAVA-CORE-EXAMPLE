package com.codewr.javacore.IO;

import java.io.DataInputStream;
import java.io.FileInputStream;

/**
 *
 * @author codewr
 */
public class AssignContentFileByVar {

    public static void main(String args[]) {

        try {

            DataInputStream dis
                    = new DataInputStream(
                            new FileInputStream("C:\\uploadFile\\test.txt"));

            byte[] datainBytes = new byte[dis.available()];
            dis.readFully(datainBytes);
            dis.close();

            String content = new String(datainBytes, 0, datainBytes.length);

            System.out.println(content);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
