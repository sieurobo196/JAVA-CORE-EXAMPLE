package com.codewr.javacore.collections;

import java.io.FileReader;
import java.util.Properties;

/**
 *
 * @author codewr
 */
public class PropertiesEx1 {

    public static void main(String[] args) throws Exception {
        // create reader object
        FileReader reader = new FileReader("user.properties");
        // crate properties object
        Properties properties = new Properties();
        properties.load(reader);
        // show file info
        System.out.println(properties.getProperty("user"));
        System.out.println(properties.getProperty("password"));
    }

}
