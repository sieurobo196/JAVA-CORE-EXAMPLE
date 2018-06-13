package com.codewr.javacore.IO;

import java.io.File;

/**
 *
 * @author codewr
 */
public class RenameFile {

    public static void main(String[] args) {

        File oldfile = new File("C:\\uploadFile\\test.txt");
        File newfile = new File("C:\\uploadFile\\test_new.txt");

        if (oldfile.renameTo(newfile)) {
            System.out.println("Rename succesful");
        } else {
            System.out.println("Rename failed");
        }

    }
}
