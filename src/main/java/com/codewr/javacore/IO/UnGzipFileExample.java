package com.codewr.javacore.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

/**
 *
 * @author codewr
 */
public class UnGzipFileExample {

    private static final String INPUT_GZIP_FILE = "c:\\uploadfile\\file1.gz";
    private static final String OUTPUT_FILE = "c:\\uploadfile\\file1.txt";

    public static void main(String[] args) {
        UnGzipFileExample gZip = new UnGzipFileExample();
        gZip.gunzipIt();
    }

    /**
     * GunZip it
     */
    public void gunzipIt() {

        byte[] buffer = new byte[1024];

        try {

            GZIPInputStream gzis
                    = new GZIPInputStream(new FileInputStream(INPUT_GZIP_FILE));

            FileOutputStream out
                    = new FileOutputStream(OUTPUT_FILE);

            int len;
            while ((len = gzis.read(buffer)) > 0) {
                out.write(buffer, 0, len);
            }

            gzis.close();
            out.close();

            System.out.println("Done");

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
