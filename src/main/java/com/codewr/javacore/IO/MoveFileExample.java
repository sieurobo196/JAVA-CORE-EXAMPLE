package com.codewr.javacore.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author NXCOMM
 */
public class MoveFileExample {

    public static void main(String[] args) {
        MoveFileExample example = new MoveFileExample();
        example.moveFileByRename();
//        example.moveFileByCopy();
    }

    public void moveFileByRename() {
        try {

            File afile = new File("C:\\uploadFile\\test.txt");

            if (afile.renameTo(new File("C:\\uploadFileNssew\\" + afile.getName()))) {
                System.out.println("File is moved successful!");
            } else {
                System.out.println("File is failed to move!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void moveFileByCopy() {
        InputStream inStream = null;
        OutputStream outStream = null;

        try {

            File afile = new File("C:\\uploadFile\\test.txt");
            File bfile = new File("C:\\uploadFileNew\\test.txt");

            inStream = new FileInputStream(afile);
            outStream = new FileOutputStream(bfile);

            byte[] buffer = new byte[1024];

            int length;
            //copy the file content in bytes 
            while ((length = inStream.read(buffer)) > 0) {

                outStream.write(buffer, 0, length);

            }

            inStream.close();
            outStream.close();

            //delete the original file
            afile.delete();

            System.out.println("File is copied successful!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
