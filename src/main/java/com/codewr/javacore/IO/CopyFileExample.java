package com.codewr.javacore.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author codewr
 */
public class CopyFileExample {

    public static void main(String[] args) {

        InputStream inStream = null;
        OutputStream outStream = null;

        try {

            File file = new File("C:\\uploadFile\\test.txt");
            File fileCopy = new File("C:\\uploadFile\\test_copy.txt");

            inStream = new FileInputStream(file);
            outStream = new FileOutputStream(fileCopy);

            byte[] buffer = new byte[1024];

            int length;
            //copy the file content in bytes 
            while ((length = inStream.read(buffer)) > 0) {

                outStream.write(buffer, 0, length);

            }

            inStream.close();
            outStream.close();

            System.out.println("File is copied successful!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
