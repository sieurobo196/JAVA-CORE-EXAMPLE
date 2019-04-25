package com.codewr.javacore.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author codewr
 */
public class CollectionGet {

    public static void main(String[] args) {
        // Creating arraylist
        ArrayList<String> list = new ArrayList<String>();
        // Add objects to arraylist
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Java");

        System.out.println("Get List with Iterator:");
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println("-" + itr.next() + " ");
        }

        System.out.println("Get List with for :");
        for (String obj : list) {
            System.out.println("-" + obj);
        }

        System.out.println("Get List with length: ");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            System.out.println("-" + list.get(i));
        }

        // Creating hashset
        Set<String> set = new HashSet<String>();
        // Add objects to hashset
        set.add("Java");
        set.add("C++");
        set.add("PHP");
        set.add("Java");
        System.out.println("Get Set with Iterator:");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println("- "+iterator.next());
        }

        System.out.println("Get Set with for:");
        for (String obj : set) {
            System.out.println("- "+obj);
        }
        
    }

}
