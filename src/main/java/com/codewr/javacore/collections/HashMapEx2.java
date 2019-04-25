package com.codewr.javacore.collections;

import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author codewr
 */
public class HashMapEx2 {

    public static void main(String[] args) {
        // init hashMap
        HashMap<String, Student> hashMap = new HashMap<String, Student>();
        // add elements to hashMap
        Student student1 = new Student("Tom", 17, "New york");
        Student student2 = new Student("Thor", 16, "London");
        Student student3 = new Student("Loki", 18, "Paris");
        hashMap.put("1", student1);
        hashMap.put(null, student2);
        hashMap.put("2", null);
        hashMap.put("4", student3);
        // show hashMap
        show(hashMap);

    }

    public static void show(HashMap<String, Student> hashMap) {
        Set<String> keySet = hashMap.keySet();
        for (String key : keySet) {
            System.out.println(key + " " + hashMap.get(key));
        }
    }

}
