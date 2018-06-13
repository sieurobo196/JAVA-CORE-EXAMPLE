package com.codewr.javacore.xml;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

/**
 *
 * @author codewr
 */
public class ConvertPropertiesFileToXmlFile {

    public static void main(String[] args) throws IOException {
        Properties props = new Properties();
        props.setProperty("email.support", "admin@codewr.com");

        //where to store?
        OutputStream os = new FileOutputStream("c:/uploadFile/email.xml");

        //store the properties detail into a pre-defined XML file
        props.storeToXML(os, "Support Email", "UTF-8");

        System.out.println("Done");
    }
}
