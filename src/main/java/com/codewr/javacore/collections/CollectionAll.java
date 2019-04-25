package com.codewr.javacore.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author codewr
 */
public class CollectionAll {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<String>();
        arrayList.add("PHP");
        arrayList.add("Python");
        arrayList.add("Java");
        arrayList.add("Java");
        arrayList.add("Nodejs");
        System.out.println("ArrayList :" + arrayList);

        List<String> linkedList = new LinkedList<String>();
        linkedList.add("PHP");
        linkedList.add("Python");
        linkedList.add("Java");
        linkedList.add("Java");
        linkedList.add("Nodejs");
        System.out.println("LinkedList :" + linkedList);

        // no order no duplicate
        Set<String> hashSet = new HashSet<String>();
        hashSet.add("PHP");
        hashSet.add("Python");
        hashSet.add("Java");
        hashSet.add("Java");
        hashSet.add("Nodejs");
        System.out.println("HashSet : " + hashSet);

        // new TreeSet() order
        Set<String> treeSet = new TreeSet<String>();
        treeSet.add("PHP");
        treeSet.add("Python");
        treeSet.add("Java");
        treeSet.add("Java");
        treeSet.add("Nodejs");
        System.out.println("TreeSet : " + treeSet);

        // no order on key
        Map<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("Windows", "2000");
        hashMap.put("Windows", "XP");
        hashMap.put("Language2", "Java");
        hashMap.put("Language1", ".Net");
        System.out.println("HashMap :" + hashMap);

        // new TreeMap() order by key
        Map<String, String> treeMap = new TreeMap<String, String>();
        treeMap.put("Windows", "2000");
        treeMap.put("Windows", "XP");
        treeMap.put("Language2", "Java");
        treeMap.put("Language1", ".Net");
        System.out.println("TreeMap :" + treeMap);
    }

}
