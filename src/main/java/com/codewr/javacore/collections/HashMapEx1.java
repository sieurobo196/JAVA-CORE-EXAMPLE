package com.codewr.javacore.collections;

import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author codewr
 */
public class HashMapEx1 {

    public static void main(String args[]) {
        // init hashMap
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        // add elements to hashMap
        hashMap.put(13, "Java");
        hashMap.put(32, "C++");
        hashMap.put(22, "PHP");
        hashMap.put(43, "Python");
        // show hashMap
        show(hashMap);
        // remove element
        hashMap.remove(22);
        // show hashMap after remove
        System.out.println("After remove:");
        // show hashMap
        show(hashMap);

    }

    public static void show(HashMap<Integer, String> hashMap) {
        Set<Integer> keySet = hashMap.keySet();
        for (Integer key : keySet) {
            System.out.println(key + " " + hashMap.get(key));
        }
    }

}
