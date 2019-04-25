package com.codewr.javacore.collections;

import java.util.Hashtable;
import java.util.Set;

/**
 *
 * @author codewr
 */
public class HashTableEx2 {

    public static void main(String[] args) {
        // init hashMap

        Hashtable<String, Student> hashMap = new Hashtable<String, Student>();
        // add elements to hashMap
        Student student1 = new Student("Tom", 17, "New york");
        Student student2 = new Student("Thor", 16, "London");
        Student student3 = new Student("Loki", 18, "Paris");
        Student student4 = new Student("Iron", 19, "Rome");
        hashMap.put("1", student1);
        hashMap.put("3", student2);
        hashMap.put("2", student3);
        hashMap.put("4", student4);
        // show hashMap
        show(hashMap);
    }

    public static void show(Hashtable<String, Student> hashtable) {
        Set<String> keySet = hashtable.keySet();
        for (String key : keySet) {
            System.out.println(key + " " + hashtable.get(key));
        }
    }
}
