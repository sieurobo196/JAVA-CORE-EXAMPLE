package com.codewr.javacore.IO;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author codewr
 */
public class DeleteTempFileExample {

    public static void main(String[] args) {

        try {

            //create a temp file
            File temp = File.createTempFile("test", ".tmp");
            System.out.println("create file temp");
            System.out.println("wait 20s then delete file");
            Thread.sleep(20000);
            
            //delete temporary file when the program is exited
//            temp.deleteOnExit();
            System.out.println("File deleted");
            //delete immediate	
            temp.delete();
        } catch (IOException e) {

            e.printStackTrace();

        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

    }
}
