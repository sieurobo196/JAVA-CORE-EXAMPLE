package com.codewr.javacore.IO;

import java.io.File;

/**
 *
 * @author codewr
 */
public class CheckEmptyDirectoryExample {

    public static void main(String[] args) {

        File file = new File("C:\\uploadFile");

        if (file.isDirectory()) {

            if (file.list().length > 0) {

                System.out.println("Folder is not empty!");

            } else {

                System.out.println("Folder is empty!");

            }

        } else {

            System.out.println("This is not a directory");

        }
    }
}
