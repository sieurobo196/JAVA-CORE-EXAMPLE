package com.codewr.javacore.IO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author codewr
 */
public class CreateDirectoryExample {

    public static void main(String[] args) {
        Path path = Paths.get("C:\\Folder2\\Sub2\\Sub-Sub2");
        //if directory exists?
        if (!Files.exists(path)) {
            try {
                Files.createDirectories(path);
                System.out.println("Folder is created");
            } catch (IOException e) {
                //fail to create directory
                e.printStackTrace();
            }
        } else {
            System.out.println("Folders is existed");
        }
    }
}
//    public void createFolders() {
//        File file = new File("C:\\Folder1");
//        if (!file.exists()) {
//            if (file.mkdir()) {
//                System.out.println("Folder is created!");
//            } else {
//                System.out.println("Failed to create f!");
//            }
//        }
//
//        File files = new File("C:\\Folder2\\Sub-Folder2\\Sub-Sub-Folder2");
//        if (!files.exists()) {
//            if (files.mkdirs()) {
//                System.out.println("Multiple folders are created!");
//            } else {
//                System.out.println("Failed to create multiple folders!");
//            }
//        }
//    }
//
//    public void createFolderJDK7() {
//        Path path = Paths.get("C:\\Directory2\\Sub2\\Sub-Sub2");
//        //if directory exists?
//        if (!Files.exists(path)) {
//            try {
//                Files.createDirectories(path);
//            } catch (IOException e) {
//                //fail to create directory
//                e.printStackTrace();
//            }
//        }
//    }
//
//}
