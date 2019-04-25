package com.codewr.javacore.collections;

import java.io.FileWriter;
import java.util.Properties;

/**
 *
 * @author codewr
 */
public class PropertiesEx3 {

    public static void main(String[] args) throws Exception {
        // create properties object
        Properties properties = new Properties();
        // add property into properties object
        properties.setProperty("user", "Loki");
        properties.setProperty("password", "12345678");
        // write properties to a file
        properties.store(new FileWriter("info.properties"), "Comment here");
    }

}
