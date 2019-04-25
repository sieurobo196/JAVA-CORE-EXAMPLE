package com.codewr.javacore.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author codewr
 */
public class MapEx2 {

    public static void main(String[] args) {
        // init map
        Map map = new HashMap();
        // add elements to map
        map.put(11, "Java");
        map.put(31, "C++");
        map.put(21, "PHP");
        map.put(41, "Python");
        map.put(51, "JAVA");
        // show Map
        Set set = map.keySet();
        for (Object key : set) {
            System.out.println(key + " " + map.get(key));
        }
    }

}
