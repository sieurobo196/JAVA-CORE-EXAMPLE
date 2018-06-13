package com.codewr.javacore.IO;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author codewr
 */
public class FilePath3 {

    public static void main(String[] args) {
        try {

            String filename = "testing.txt";
            String workingDir = System.getProperty("user.dir");

            String absoluteFilePath = "";

            String your_os = System.getProperty("os.name").toLowerCase();
            System.out.println(workingDir);
            System.out.println(your_os);
            if (your_os.indexOf("win") >= 0) {

                //if windows
                absoluteFilePath = workingDir + "\\" + filename;

            } else if (your_os.indexOf("nix") >= 0
                    || your_os.indexOf("nux") >= 0
                    || your_os.indexOf("mac") >= 0) {

                //if unix or mac 
                absoluteFilePath = workingDir + "/" + filename;

            } else {

                //unknow os?
                absoluteFilePath = workingDir + "/" + filename;

            }

            System.out.println("Final filepath : " + absoluteFilePath);

            File file = new File(absoluteFilePath);

            if (file.createNewFile()) {
                System.out.println("Done");
            } else {
                System.out.println("File already exists!");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
