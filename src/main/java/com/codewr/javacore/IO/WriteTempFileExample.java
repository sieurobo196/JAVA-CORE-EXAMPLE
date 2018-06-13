package com.codewr.javacore.IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author codewr
 */
public class WriteTempFileExample {

    public static void main(String[] args) {

        try {

            //create a temp file
            File temp = File.createTempFile("test", ".tmp");

            //write it
            BufferedWriter bw = new BufferedWriter(new FileWriter(temp));
            bw.write("This is the temporary file content");
            bw.close();

            System.out.println("Temp file :"+temp.getAbsolutePath());
            System.out.println("Write done");

        } catch (IOException e) {

            e.printStackTrace();

        }

    }
}
