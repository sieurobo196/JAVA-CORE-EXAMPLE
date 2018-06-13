package com.codewr.javacore.IO;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author codewr
 */

public class FileCheckHidden {

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\uploadFile\\test.txt");

        if (file.isHidden()) {
            System.out.println("This file is hidden");
        } else {
            System.out.println("This file is not hidden");
        }
    }
}
