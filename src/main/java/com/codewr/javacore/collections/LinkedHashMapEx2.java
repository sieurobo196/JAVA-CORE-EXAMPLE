package com.codewr.javacore.collections;

import java.util.LinkedHashMap;
import java.util.Set;

/**
 *
 * @author codewr
 */
public class LinkedHashMapEx2 {

    public static void main(String[] args) {
        // init linkedHashMap
        LinkedHashMap<String, Student> linkedHashMap
                = new LinkedHashMap<String, Student>();
        // add elements to linkedHashMap
        Student student1 = new Student("Tom", 17, "New york");
        Student student2 = new Student("Thor", 16, "London");
        Student student3 = new Student("Loki", 18, "Paris");
        linkedHashMap.put("1", student1);
        linkedHashMap.put(null, student2);
        linkedHashMap.put("2", null);
        linkedHashMap.put("4", student3);
        // show linkedHashMap
        show(linkedHashMap);

    }

    public static void show(LinkedHashMap<String, Student> linkedHashMap) {
        Set<String> keySet = linkedHashMap.keySet();
        for (String key : keySet) {
            System.out.println(key + " " + linkedHashMap.get(key));
        }
    }

}
