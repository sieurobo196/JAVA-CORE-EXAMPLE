package com.codewr.javacore.collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 *
 * @author codewr
 */
public class PropertiesEx2 {

    public static void main(String[] args) throws Exception {
        // get system properties
        Properties properties = System.getProperties();
        Set set = properties.entrySet();
        // show system properties
        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

    }

}
