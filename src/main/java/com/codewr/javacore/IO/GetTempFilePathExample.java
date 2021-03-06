package com.codewr.javacore.IO;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author codewr
 */
public class GetTempFilePathExample {

    public static void main(String[] args) {

        try {

            //create a temp file
            File temp = File.createTempFile("test", ".tmp");

            System.out.println("Temp file : " + temp.getAbsolutePath());

            //Get tempropary file path
            String absolutePath = temp.getAbsolutePath();
            String tempFilePath = absolutePath.
                    substring(0, absolutePath.lastIndexOf(File.separator));

            System.out.println("Temp file path : " + tempFilePath);

        } catch (IOException e) {

            e.printStackTrace();

        }

    }
}
