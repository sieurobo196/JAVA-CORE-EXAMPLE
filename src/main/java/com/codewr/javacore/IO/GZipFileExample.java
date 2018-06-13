package com.codewr.javacore.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/**
 *
 * @author codewr
 */

public class GZipFileExample {

    private static final String OUTPUT_GZIP_FILE = "c:\\uploadfile\\file1.gz";
    private static final String SOURCE_FILE = "c:\\uploadFile\\test1.txt";

    public static void main(String[] args) {
        GZipFileExample gZip = new GZipFileExample();
        gZip.gzipIt();
    }

    /**
     * GZip it
     *
     * @param zipFile output GZip file location
     */
    public void gzipIt() {

        byte[] buffer = new byte[1024];

        try {

            GZIPOutputStream gzos
                    = new GZIPOutputStream(new FileOutputStream(OUTPUT_GZIP_FILE));

            FileInputStream in
                    = new FileInputStream(SOURCE_FILE);

            int len;
            while ((len = in.read(buffer)) > 0) {
                gzos.write(buffer, 0, len);
            }

            in.close();

            gzos.finish();
            gzos.close();

            System.out.println("Done");

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
