package com.codewr.javacore.IO;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import org.apache.commons.io.IOUtils;

/**
 *
 * @author codewr
 */
public class ReadFileFromResourcesFolder {

    public static void main(String[] args) {
        ReadFileFromResourcesFolder obj = new ReadFileFromResourcesFolder();
        System.out.println("content file: ");
        System.out.println(obj.getFileWithUtil("test.txt"));
    }

    private String getFileWithUtil(String fileName) {

        String result = "";

        ClassLoader classLoader = getClass().getClassLoader();
        try {
            result = IOUtils.toString(classLoader.getResourceAsStream(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    private String getFile(String fileName) {

        StringBuilder result = new StringBuilder("");

        //Get file from resources folder
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(fileName).getFile());

        try (Scanner scanner = new Scanner(file)) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                result.append(line).append("\n");
            }

            scanner.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return result.toString();

    }
}
