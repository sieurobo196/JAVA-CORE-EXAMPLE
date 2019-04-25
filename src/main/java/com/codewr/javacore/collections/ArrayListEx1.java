package com.codewr.javacore.collections;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author codewr
 */
public class ArrayListEx1 {

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
        ArrayList<String> list1 = new ArrayList<>(list);
        System.out.println(list1);
    }
}
