package com.codewr.javacore.xml;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author codewr
 */
public class ConvertXMLFileToPropertiesFile {

    public static void main(String[] args) throws IOException {
        Properties props = new Properties();

        InputStream is = new FileInputStream("c:/uploadFile/email.xml");
        //load the xml file into properties format
        props.loadFromXML(is);

        String email = props.getProperty("email.support");

        System.out.println("email.support: " + email);

    }
}
