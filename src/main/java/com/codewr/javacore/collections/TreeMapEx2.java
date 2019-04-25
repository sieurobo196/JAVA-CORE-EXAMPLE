package com.codewr.javacore.collections;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author codewr
 */
public class TreeMapEx2 {

    public static void main(String args[]) {
        // init treeMap
        Map<String, Student> treeMap = new TreeMap<String, Student>();
        Student student1 = new Student("Tom", 17, "New york");
        Student student2 = new Student("Thor", 16, "London");
        Student student3 = new Student("Loki", 18, "Paris");
        Student student4 = new Student("Iron", 19, "Rome");
        // add elements to treeMap
        treeMap.put("1", student1);
        treeMap.put("3", student3);
        treeMap.put("5", null);
        treeMap.put("4", student4);
        treeMap.put("2", student2);
        // show treeMap
        show(treeMap);
    }

    public static void show(Map<String, Student> map) {
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(key + " " + map.get(key));
        }
    }

}
