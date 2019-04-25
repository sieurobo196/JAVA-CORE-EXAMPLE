package com.codewr.javacore.collections;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
 

/**
 *
 * @author codewr
 */
public class TreeMapEx1 {

    public static void main(String args[]) {
        // init treeMap
        Map<Integer, String> treeMap = new TreeMap<Integer, String>();
        // add elements to treeMap
        treeMap.put(1, "Java");
        treeMap.put(3, "C++");
        treeMap.put(2, "PHP");
        treeMap.put(4, "Python");
        // show treeMap
        show(treeMap);
        // remove element
        treeMap.remove(3);
        // show treeMap after remove
        System.out.println("After remove:");
        // show treeMap
        show(treeMap);

    }

    /**
     * show map
     *
     * @param viettuts.vn
     */
    public static void show(Map<Integer, String> map) {
        Set<Integer> keySet = map.keySet();
        for (Integer key : keySet) {
            System.out.println(key + " " + map.get(key));
        }
    }

}
