package com.codewr.javacore.collections;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author codewr
 */
public class LinkedListEx1 {

    public static void main(String[] args) {
        // Create linkedList
        LinkedList<String> linkedList = new LinkedList<String>();
        // Add objects to linkedList
        linkedList.add("Java");
        linkedList.add("C++");
        linkedList.add("PHP");
        linkedList.add("Java");
        System.out.println("Get List:");
        Iterator<String> itr = linkedList.iterator();
        while (itr.hasNext()) {
            System.out.println("- " + itr.next());
        }
        // add first
        linkedList.addFirst("Python");
        System.out.println("Get List after add first:");
        for (String obj : linkedList) {
            System.out.println("- " + obj);
        }
        System.out.println("Get List after add first:");
        linkedList.addLast("Ruby");
        int size = linkedList.size();
        for (int i = 0; i < size; i++) {
            System.out.println("- " + linkedList.get(i));
        }

        LinkedList<String> linkedList1 = new LinkedList<String>();
        linkedList1.add("C#");
        linkedList1.addAll(linkedList);
        linkedList1.add(3, "C");
        System.out.println(linkedList1);
    }
}
