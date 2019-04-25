package com.codewr.javacore.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author codewr
 */
public class MapEx1 {

    public static void main(String args[]) {
        // init map
        Map<String, String> map = new HashMap<String, String>();
        map.put("C", "Java");
        map.put("B", "C++");
        map.put("A", "PHP");
        map.put("D", null);
        map.put(null, null);
        // show map
        Set<String> set = map.keySet();

        for (String key : set) {
            System.out.println(key + " " + map.get(key));
        }
    }

}
