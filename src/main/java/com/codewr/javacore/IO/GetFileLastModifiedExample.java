
package com.codewr.javacore.IO;

import java.io.File;
import java.text.SimpleDateFormat;

/**
 *
 * @author codewr
 */
public class GetFileLastModifiedExample {

    public static void main(String[] args) {
        File file = new File("C:\\uploadFile\\test.txt");

        System.out.println("Before Format : " + file.lastModified());

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

        System.out.println("After Format : " + sdf.format(file.lastModified()));
    }
}
