package com.codewr.javacore.collections;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author codewr
 */
public class MapEx3 {

    public static void main(String args[]) {
        // init map
        Map<Integer, String> map = new HashMap<Integer, String>();
        // add elements to map
        map.put(11, "Java");
        map.put(31, "C++");
        map.put(21, "PHP");
        map.put(41, "Python");
        // show map
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

}
